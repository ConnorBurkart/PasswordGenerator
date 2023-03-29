using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PasswordGenerator.Forms
{
    public partial class frmList : Form
    {
        public string stdResult { get; set; }




        public frmList()
        {
            InitializeComponent();
        }


        private void frmList_Load(object sender, EventArgs e)
        {
            textBox1.Text = stdResult;
        }
    }
}
