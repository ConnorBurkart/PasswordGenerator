namespace PasswordGenerator.Forms
{
    partial class FrmManager
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.pIDDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.pUserNameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.pPasswordDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.pURLDomainDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.tblPasswordListBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.masterDataSet = new PasswordGenerator.masterDataSet();
            this.tblPasswordListTableAdapter = new PasswordGenerator.masterDataSetTableAdapters.tblPasswordListTableAdapter();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tblPasswordListBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.masterDataSet)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoGenerateColumns = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.pIDDataGridViewTextBoxColumn,
            this.pUserNameDataGridViewTextBoxColumn,
            this.pPasswordDataGridViewTextBoxColumn,
            this.pURLDomainDataGridViewTextBoxColumn});
            this.dataGridView1.DataSource = this.tblPasswordListBindingSource;
            this.dataGridView1.Location = new System.Drawing.Point(71, 72);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowTemplate.Height = 24;
            this.dataGridView1.Size = new System.Drawing.Size(540, 150);
            this.dataGridView1.TabIndex = 0;
            // 
            // pIDDataGridViewTextBoxColumn
            // 
            this.pIDDataGridViewTextBoxColumn.DataPropertyName = "PID";
            this.pIDDataGridViewTextBoxColumn.HeaderText = "PID";
            this.pIDDataGridViewTextBoxColumn.Name = "pIDDataGridViewTextBoxColumn";
            this.pIDDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // pUserNameDataGridViewTextBoxColumn
            // 
            this.pUserNameDataGridViewTextBoxColumn.DataPropertyName = "P_UserName";
            this.pUserNameDataGridViewTextBoxColumn.HeaderText = "P_UserName";
            this.pUserNameDataGridViewTextBoxColumn.Name = "pUserNameDataGridViewTextBoxColumn";
            // 
            // pPasswordDataGridViewTextBoxColumn
            // 
            this.pPasswordDataGridViewTextBoxColumn.DataPropertyName = "P_Password";
            this.pPasswordDataGridViewTextBoxColumn.HeaderText = "P_Password";
            this.pPasswordDataGridViewTextBoxColumn.Name = "pPasswordDataGridViewTextBoxColumn";
            // 
            // pURLDomainDataGridViewTextBoxColumn
            // 
            this.pURLDomainDataGridViewTextBoxColumn.DataPropertyName = "P_URL_Domain";
            this.pURLDomainDataGridViewTextBoxColumn.HeaderText = "P_URL_Domain";
            this.pURLDomainDataGridViewTextBoxColumn.Name = "pURLDomainDataGridViewTextBoxColumn";
            // 
            // tblPasswordListBindingSource
            // 
            this.tblPasswordListBindingSource.DataMember = "tblPasswordList";
            this.tblPasswordListBindingSource.DataSource = this.masterDataSet;
            // 
            // masterDataSet
            // 
            this.masterDataSet.DataSetName = "masterDataSet";
            this.masterDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // tblPasswordListTableAdapter
            // 
            this.tblPasswordListTableAdapter.ClearBeforeFill = true;
            // 
            // FrmManager
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.dataGridView1);
            this.Name = "FrmManager";
            this.Text = "FrmManager";
            this.Load += new System.EventHandler(this.FrmManager_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tblPasswordListBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.masterDataSet)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView1;
        private masterDataSet masterDataSet;
        private System.Windows.Forms.BindingSource tblPasswordListBindingSource;
        private masterDataSetTableAdapters.tblPasswordListTableAdapter tblPasswordListTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn pIDDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn pUserNameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn pPasswordDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn pURLDomainDataGridViewTextBoxColumn;
    }
}