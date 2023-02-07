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

        public home()
        {
            InitializeComponent();
        }

        public void generatePassword()
        {
        }

        private void resultButton_Click(object sender, EventArgs e)
        {
            finalResult.Text = lengthBox.Text;

        }

        private void home_Load(object sender, EventArgs e)
        {

        }

        private void lengthBox_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
