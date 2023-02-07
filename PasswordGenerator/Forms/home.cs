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

        private void resultButton_Click(object sender, EventArgs e)
        {
            passwordLength = Convert.ToInt16(lengthBox.Text.ToString());

            finalResult.Text = hlp.generatePassword(passwordLength);
        }
    }
}
