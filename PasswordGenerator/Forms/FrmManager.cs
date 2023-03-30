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
    public partial class FrmManager : Form
    {
        public FrmManager()
        {
            InitializeComponent();
        }

        private void FrmManager_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'masterDataSet.tblPasswordList' table. You can move, or remove it, as needed.
            this.tblPasswordListTableAdapter.Fill(this.masterDataSet.tblPasswordList);

         }
    }
}
