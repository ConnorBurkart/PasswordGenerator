namespace PasswordGenerator.Forms
{
    partial class frmLogin
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
            this.loginBox = new System.Windows.Forms.TextBox();
            this.passwordBox = new System.Windows.Forms.TextBox();
            this.panel1 = new System.Windows.Forms.Panel();
            this.lblPassword = new System.Windows.Forms.Label();
            this.lblUser = new System.Windows.Forms.Label();
            this.lblNewAccount = new System.Windows.Forms.LinkLabel();
            this.butLogin = new System.Windows.Forms.Button();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // loginBox
            // 
            this.loginBox.Location = new System.Drawing.Point(108, 20);
            this.loginBox.Margin = new System.Windows.Forms.Padding(4);
            this.loginBox.Name = "loginBox";
            this.loginBox.Size = new System.Drawing.Size(132, 27);
            this.loginBox.TabIndex = 0;
            // 
            // passwordBox
            // 
            this.passwordBox.Location = new System.Drawing.Point(108, 52);
            this.passwordBox.Margin = new System.Windows.Forms.Padding(4);
            this.passwordBox.Name = "passwordBox";
            this.passwordBox.Size = new System.Drawing.Size(132, 27);
            this.passwordBox.TabIndex = 1;
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.butLogin);
            this.panel1.Controls.Add(this.lblPassword);
            this.panel1.Controls.Add(this.lblUser);
            this.panel1.Controls.Add(this.passwordBox);
            this.panel1.Controls.Add(this.loginBox);
            this.panel1.Font = new System.Drawing.Font("Arial", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.panel1.Location = new System.Drawing.Point(106, 66);
            this.panel1.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(269, 135);
            this.panel1.TabIndex = 2;
            this.panel1.Paint += new System.Windows.Forms.PaintEventHandler(this.panel1_Paint);
            // 
            // lblPassword
            // 
            this.lblPassword.AutoSize = true;
            this.lblPassword.Location = new System.Drawing.Point(3, 55);
            this.lblPassword.Name = "lblPassword";
            this.lblPassword.Size = new System.Drawing.Size(85, 19);
            this.lblPassword.TabIndex = 3;
            this.lblPassword.Text = "Password:";
            // 
            // lblUser
            // 
            this.lblUser.AutoSize = true;
            this.lblUser.Location = new System.Drawing.Point(3, 23);
            this.lblUser.Name = "lblUser";
            this.lblUser.Size = new System.Drawing.Size(93, 19);
            this.lblUser.TabIndex = 2;
            this.lblUser.Text = "Username: ";
            // 
            // lblNewAccount
            // 
            this.lblNewAccount.Font = new System.Drawing.Font("Arial", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblNewAccount.Location = new System.Drawing.Point(205, 224);
            this.lblNewAccount.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblNewAccount.Name = "lblNewAccount";
            this.lblNewAccount.Size = new System.Drawing.Size(92, 32);
            this.lblNewAccount.TabIndex = 3;
            this.lblNewAccount.TabStop = true;
            this.lblNewAccount.Text = "Sign up";
            this.lblNewAccount.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.lblNewAccount_LinkClicked);
            // 
            // butLogin
            // 
            this.butLogin.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.butLogin.Location = new System.Drawing.Point(0, 94);
            this.butLogin.Name = "butLogin";
            this.butLogin.Size = new System.Drawing.Size(269, 41);
            this.butLogin.TabIndex = 4;
            this.butLogin.Text = "Login";
            this.butLogin.UseVisualStyleBackColor = true;
            this.butLogin.Click += new System.EventHandler(this.butLogin_Click);
            // 
            // frmLogin
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.PeachPuff;
            this.ClientSize = new System.Drawing.Size(482, 303);
            this.Controls.Add(this.lblNewAccount);
            this.Controls.Add(this.panel1);
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "frmLogin";
            this.Text = "frmLogin";
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TextBox loginBox;
        private System.Windows.Forms.TextBox passwordBox;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label lblPassword;
        private System.Windows.Forms.Label lblUser;
        private System.Windows.Forms.LinkLabel lblNewAccount;
        private System.Windows.Forms.Button butLogin;
    }
}