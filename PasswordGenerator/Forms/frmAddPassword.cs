using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using PasswordGenerator.Forms;


namespace PasswordGenerator.Forms
{
    public partial class frmAddPassword : Form
    {
        public string stdResult { get; set; } // Password
        public string stdUsername { get; set; } // Username
        public string stdUrl { get; set; } // Domain

        public frmAddPassword()
        {
            InitializeComponent();

        }


        private void frmList_Load(object sender, EventArgs e)
        {
            // Simply puts the password from home into the correlating box
            passwordBox.Text = stdResult;

        }

        private void btAdd_Click(object sender, EventArgs e)
        {

            // Sets Each textbox to its variable
            stdResult = passwordBox.Text;
            stdUsername = usernameBox.Text;
            stdUrl = urlBox.Text;

            hlp.AddEntryToFile(stdUsername , stdResult, stdUrl);


            home newHome = new home();

            this.Close();
            

        }
    }
}
