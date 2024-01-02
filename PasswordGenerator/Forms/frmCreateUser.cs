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
    public partial class frmCreateUser : Form
    {
        public frmCreateUser()
        {
            InitializeComponent();
        }

        private void lblNewAccount_Click(object sender, EventArgs e)
        {
            string filePath = "login.txt"; // Just the file name
            string newEntry = loginBox.Text + " " + passwordBox.Text;



            // Check if the file exists
            if (File.Exists(filePath))
            {
                // Read all lines from the file
                string[] lines = File.ReadAllLines(filePath);

                // Check if any line contains the new entry
                foreach (string line in lines)
                {
                    if (line.Equals(newEntry))
                    {
                        MessageBox.Show("User Already Exist", "Information", MessageBoxButtons.OK, MessageBoxIcon.Information);
                        return; // Stop the method if entry is found
                    }
                }
            }
                File.AppendAllText(filePath, loginBox.Text + " " + passwordBox.Text + Environment.NewLine);

                this.Close();
            


        }
    }

}
