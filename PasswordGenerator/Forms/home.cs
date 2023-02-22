using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
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

        public home()
        {
            InitializeComponent();
            
        }
        // This is the end all be all button that actually calls the function to make the password
        private void resultButton_Click(object sender, EventArgs e)
        {
            if(lengthBox.Text.ToString() == "")
            {
                MessageBox.Show("Enter a length");
                return;
            }

            passwordLength = Convert.ToInt16(lengthBox.Text.ToString());

            finalResult.Text = hlp.generatePassword(passwordLength, letter, num,spec);
        }
        //This is to see if we want to include numbers
        private void numChecked_Checbox(object sender, EventArgs e)
        {
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
            if (specialBox.Checked)
            {
                spec = true;
            }
            else
            {
                spec = false;
            }
        }
    }
}
