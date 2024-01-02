
namespace PasswordGenerator.Forms
{
    partial class frmCreateUser
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
            this.loginBox = new System.Windows.Forms.TextBox();
            this.lblPassword = new System.Windows.Forms.Label();
            this.lblUser = new System.Windows.Forms.Label();
            this.lblNewAccount = new System.Windows.Forms.LinkLabel();
            this.SuspendLayout();
            // 
            // passwordBox
            // 
            this.passwordBox.Location = new System.Drawing.Point(197, 124);
            this.passwordBox.Margin = new System.Windows.Forms.Padding(4);
            this.passwordBox.Name = "passwordBox";
            this.passwordBox.Size = new System.Drawing.Size(132, 22);
            this.passwordBox.TabIndex = 1;
            // 
            // loginBox
            // 
            this.loginBox.Location = new System.Drawing.Point(197, 92);
            this.loginBox.Margin = new System.Windows.Forms.Padding(4);
            this.loginBox.Name = "loginBox";
            this.loginBox.Size = new System.Drawing.Size(132, 22);
            this.loginBox.TabIndex = 0;
            // 
            // lblPassword
            // 
            this.lblPassword.AutoSize = true;
            this.lblPassword.Location = new System.Drawing.Point(114, 130);
            this.lblPassword.Name = "lblPassword";
            this.lblPassword.Size = new System.Drawing.Size(73, 17);
            this.lblPassword.TabIndex = 3;
            this.lblPassword.Text = "Password:";
            // 
            // lblUser
            // 
            this.lblUser.AutoSize = true;
            this.lblUser.Location = new System.Drawing.Point(114, 98);
            this.lblUser.Name = "lblUser";
            this.lblUser.Size = new System.Drawing.Size(81, 17);
            this.lblUser.TabIndex = 2;
            this.lblUser.Text = "Username: ";
            // 
            // lblNewAccount
            // 
            this.lblNewAccount.AutoSize = true;
            this.lblNewAccount.Location = new System.Drawing.Point(194, 173);
            this.lblNewAccount.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblNewAccount.Name = "lblNewAccount";
            this.lblNewAccount.Size = new System.Drawing.Size(50, 17);
            this.lblNewAccount.TabIndex = 5;
            this.lblNewAccount.TabStop = true;
            this.lblNewAccount.Text = "Create";
            this.lblNewAccount.Click += new System.EventHandler(this.lblNewAccount_Click);
            // 
            // frmCreateUser
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(483, 281);
            this.Controls.Add(this.lblPassword);
            this.Controls.Add(this.lblUser);
            this.Controls.Add(this.lblNewAccount);
            this.Controls.Add(this.passwordBox);
            this.Controls.Add(this.loginBox);
            this.Name = "frmCreateUser";
            this.Text = "frmCreateUser";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox passwordBox;
        private System.Windows.Forms.TextBox loginBox;
        private System.Windows.Forms.Label lblPassword;
        private System.Windows.Forms.Label lblUser;
        private System.Windows.Forms.LinkLabel lblNewAccount;
    }
}