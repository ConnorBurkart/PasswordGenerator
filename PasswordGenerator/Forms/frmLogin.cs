using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace PasswordGenerator.Forms
{
    public partial class frmLogin : Form
    {
        public frmLogin()
        {
            InitializeComponent();
        }

        private void lblNewAccount_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            // Create an instance of frmCreateUser
            frmCreateUser createUserForm = new frmCreateUser();

            // Show frmCreateUser
            createUserForm.Show();
        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void butLogin_Click(object sender, EventArgs e)
        {
            bool isValidUser = ValidateUser(loginBox.Text, passwordBox.Text);
            if (isValidUser)
            {
                // Create an instance of frmCreateUser
                home frmHome = new home();

                // Show frmCreateUser
                frmHome.Show();
            }
            else
            {
                MessageBox.Show("Invalid username or password.", "Login Failed", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
        }

        static bool ValidateUser(string username, string password)
        {
            string filePath = "login.txt";
            string credentialsToCheck = username + " " + password;

            try
            {
                // Check if the file exists
                if (File.Exists(filePath))
                {
                    // Read all lines from the file
                    string[] lines = File.ReadAllLines(filePath);

                    // Check if any line matches the provided credentials
                    foreach (string line in lines)
                    {
                        if (line.Equals(credentialsToCheck))
                        {
                            return true; // Credentials match an entry
                        }
                    }
                }

                // No matching entry found
                return false;
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error reading the file: " + ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return false; // Return false in case of an error
            }
        }
    }
}
