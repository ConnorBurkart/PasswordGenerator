using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

using System.Data.SqlClient;
using System.Security.Cryptography;

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

            // Makes new connection to local host
            System.Data.SqlClient.SqlConnection sqlConnection1 = new System.Data.SqlClient.SqlConnection("Data Source=localhost;Initial Catalog=master;Integrated Security=True");

            // Makes new sql connection to local host and emphasizes the text
            System.Data.SqlClient.SqlCommand cmd = new System.Data.SqlClient.SqlCommand();
            cmd.CommandType = System.Data.CommandType.Text;

            // Create the two strings dynamically and creates the foundation of the query.
            string sqlInsertTblPassword = "INSERT into tblPasswordList (P_Username,P_Password,P_URL_Domain)";
            string sqlInsertTblPasswordResults = "VALUES (" +"'" +stdUsername +"'" + ", " +"'" + stdResult +"'"+ ", " +"'" + stdUrl +"'" + ")";

            // This create the query
            cmd.CommandText = sqlInsertTblPassword + sqlInsertTblPasswordResults;

            // This adds the command connection to the query
            cmd.Connection = sqlConnection1;

            // This is what excutes and opens the connection to do the magic
            sqlConnection1.Open();
            cmd.ExecuteNonQuery();
            sqlConnection1.Close();

        }
    }
}
