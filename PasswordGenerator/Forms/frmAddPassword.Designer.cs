namespace PasswordGenerator.Forms
{
    partial class frmAddPassword
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
            this.passwordBox = new System.Windows.Forms.TextBox();
            this.usernameBox = new System.Windows.Forms.TextBox();
            this.Username = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.urlBox = new System.Windows.Forms.TextBox();
            this.btAddtoPasswordList = new System.Windows.Forms.Button();
            this.panel6 = new System.Windows.Forms.Panel();
            this.SuspendLayout();
            // 
            // passwordBox
            // 
            this.passwordBox.Location = new System.Drawing.Point(272, 117);
            this.passwordBox.Name = "passwordBox";
            this.passwordBox.Size = new System.Drawing.Size(194, 22);
            this.passwordBox.TabIndex = 0;
            // 
            // usernameBox
            // 
            this.usernameBox.Location = new System.Drawing.Point(272, 71);
            this.usernameBox.Name = "usernameBox";
            this.usernameBox.Size = new System.Drawing.Size(194, 22);
            this.usernameBox.TabIndex = 1;
            // 
            // Username
            // 
            this.Username.AutoSize = true;
            this.Username.Font = new System.Drawing.Font("Century Gothic", 16.2F);
            this.Username.ForeColor = System.Drawing.Color.Coral;
            this.Username.Location = new System.Drawing.Point(101, 59);
            this.Username.Name = "Username";
            this.Username.Size = new System.Drawing.Size(156, 34);
            this.Username.TabIndex = 2;
            this.Username.Text = "Username:";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Century Gothic", 16.2F);
            this.label1.ForeColor = System.Drawing.Color.Coral;
            this.label1.Location = new System.Drawing.Point(37, 105);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(220, 34);
            this.label1.TabIndex = 3;
            this.label1.Text = "New Password:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Century Gothic", 16.2F);
            this.label2.ForeColor = System.Drawing.Color.Coral;
            this.label2.Location = new System.Drawing.Point(6, 149);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(260, 34);
            this.label2.TabIndex = 4;
            this.label2.Text = "Website/Domain: ";
            // 
            // urlBox
            // 
            this.urlBox.Location = new System.Drawing.Point(272, 161);
            this.urlBox.Name = "urlBox";
            this.urlBox.Size = new System.Drawing.Size(194, 22);
            this.urlBox.TabIndex = 5;
            // 
            // btAddtoPasswordList
            // 
            this.btAddtoPasswordList.Location = new System.Drawing.Point(218, 209);
            this.btAddtoPasswordList.Name = "btAddtoPasswordList";
            this.btAddtoPasswordList.Size = new System.Drawing.Size(75, 23);
            this.btAddtoPasswordList.TabIndex = 6;
            this.btAddtoPasswordList.Text = "Add";
            this.btAddtoPasswordList.UseVisualStyleBackColor = true;
            this.btAddtoPasswordList.Click += new System.EventHandler(this.btAdd_Click);
            // 
            // panel6
            // 
            this.panel6.BackColor = System.Drawing.Color.Red;
            this.panel6.Location = new System.Drawing.Point(431, 0);
            this.panel6.Name = "panel6";
            this.panel6.Size = new System.Drawing.Size(66, 45);
            this.panel6.TabIndex = 7;
            // 
            // frmAddPassword
            // 
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.None;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(45)))), ((int)(((byte)(45)))), ((int)(((byte)(48)))));
            this.ClientSize = new System.Drawing.Size(498, 244);
            this.Controls.Add(this.panel6);
            this.Controls.Add(this.btAddtoPasswordList);
            this.Controls.Add(this.urlBox);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.Username);
            this.Controls.Add(this.usernameBox);
            this.Controls.Add(this.passwordBox);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "frmAddPassword";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "frmList";
            this.Load += new System.EventHandler(this.frmList_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox passwordBox;
        private System.Windows.Forms.TextBox usernameBox;
        private System.Windows.Forms.Label Username;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox urlBox;
        private System.Windows.Forms.Button btAddtoPasswordList;
        private System.Windows.Forms.Panel panel6;
    }
}