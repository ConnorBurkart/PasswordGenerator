using PasswordGenerator.Forms;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PasswordGenerator
{
    public partial class home : Form
    {
        int passwordLength = 0;
        bool num = false;
        bool letter = false;
        bool spec = false;
        public int specialCount = 18;
        public int numberCount = 10;
        public int letterCount = 51;
        public string username;
        public string password;



        public home()
        {
            InitializeComponent();
            lblUser.Text = username;


        }
        // This is the end all be all button that actually calls the function to make the password
        private void resultButton_Click(object sender, EventArgs e)
        {
            // Makes sure user enters a length
            if(lengthBox.Text.ToString() == "")
            {
                MessageBox.Show("Enter a length");

                return;
            }

            passwordLength = Convert.ToInt16(lengthBox.Text.ToString());
            finalResult.Text = hlp.generatePassword(passwordLength, letter, num,spec);

            if(numberBox.Checked == false && specialBox.Checked == false && letterBox.Checked == false)
            {
                MessageBox.Show("Check a Box");

                return;
               
            }

            // Copies Text to Clipboard
            Clipboard.SetText(finalResult.Text);

        }
        //This is to see if we want to include numbers
        private void numChecked_Checbox(object sender, EventArgs e)
        {
            // Validates Box Logic
            if(numberBox.Checked)
            {
                num = true;
            }
            else
            {
                num = false;
            }

        }
        //This is to see if we want to include letters
        private void letterBox_Click(object sender, EventArgs e)
        {
            // Validates Box Logic
            if (letterBox.Checked)
            {
                letter = true;
            }
            else
            {
                letter = false;
            }
        }
        //This is to see if we want to include Special Characters
        private void specialBox_Click(object sender, EventArgs e)
        {
            // Validates Box Logic
            if (specialBox.Checked)
            {
                spec = true;
            }
            else
            {
                spec = false;
            }
        }

        private void addPasswordList(object sender, EventArgs e)
        {

            // Calls frmAddPassword to add a password to the list 
            frmAddPassword newfrom = new frmAddPassword();

            // This copies the string form the home screen to addpassword
            newfrom.stdResult = finalResult.Text;     

            // Shows Form
            newfrom.Show();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        public void InformationFromLogin(string user, string pass)
        {
            username = user;
            password = pass;

        }

    }
}
