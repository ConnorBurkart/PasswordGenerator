﻿namespace PasswordGenerator
{
    partial class home
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(home));
            this.finalResult = new System.Windows.Forms.TextBox();
            this.tblTitle = new System.Windows.Forms.Label();
            this.lblPassword = new System.Windows.Forms.Label();
            this.lengthBox = new System.Windows.Forms.TextBox();
            this.resultButton = new System.Windows.Forms.Button();
            this.numberBox = new System.Windows.Forms.CheckBox();
            this.letterBox = new System.Windows.Forms.CheckBox();
            this.specialBox = new System.Windows.Forms.CheckBox();
            this.addPasswordButton = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.panel5 = new System.Windows.Forms.Panel();
            this.panel6 = new System.Windows.Forms.Panel();
            this.lblUser = new System.Windows.Forms.Label();
            this.lblUser2 = new System.Windows.Forms.Label();
            this.panel1 = new System.Windows.Forms.Panel();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.panel5.SuspendLayout();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // finalResult
            // 
            this.finalResult.Anchor = System.Windows.Forms.AnchorStyles.Left;
            this.finalResult.Location = new System.Drawing.Point(344, 156);
            this.finalResult.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.finalResult.Name = "finalResult";
            this.finalResult.ReadOnly = true;
            this.finalResult.Size = new System.Drawing.Size(201, 22);
            this.finalResult.TabIndex = 0;
            // 
            // tblTitle
            // 
            this.tblTitle.AutoSize = true;
            this.tblTitle.Font = new System.Drawing.Font("Century Gothic", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tblTitle.ForeColor = System.Drawing.Color.Coral;
            this.tblTitle.Location = new System.Drawing.Point(8, 0);
            this.tblTitle.Name = "tblTitle";
            this.tblTitle.Size = new System.Drawing.Size(331, 37);
            this.tblTitle.TabIndex = 1;
            this.tblTitle.Text = "Passoword Generator";
            this.tblTitle.Click += new System.EventHandler(this.tblTitle_Click);
            // 
            // lblPassword
            // 
            this.lblPassword.AutoSize = true;
            this.lblPassword.Font = new System.Drawing.Font("Century Gothic", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPassword.ForeColor = System.Drawing.Color.Coral;
            this.lblPassword.Location = new System.Drawing.Point(4, 123);
            this.lblPassword.Name = "lblPassword";
            this.lblPassword.Size = new System.Drawing.Size(186, 23);
            this.lblPassword.TabIndex = 2;
            this.lblPassword.Text = "Password Length: ";
            // 
            // lengthBox
            // 
            this.lengthBox.Anchor = System.Windows.Forms.AnchorStyles.Left;
            this.lengthBox.Location = new System.Drawing.Point(196, 123);
            this.lengthBox.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.lengthBox.Name = "lengthBox";
            this.lengthBox.Size = new System.Drawing.Size(32, 22);
            this.lengthBox.TabIndex = 20;
            this.lengthBox.TextChanged += new System.EventHandler(this.lengthBox_TextChanged);
            // 
            // resultButton
            // 
            this.resultButton.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.resultButton.Location = new System.Drawing.Point(437, 231);
            this.resultButton.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.resultButton.Name = "resultButton";
            this.resultButton.Size = new System.Drawing.Size(132, 48);
            this.resultButton.TabIndex = 4;
            this.resultButton.Text = "Generate";
            this.resultButton.UseVisualStyleBackColor = true;
            this.resultButton.Click += new System.EventHandler(this.resultButton_Click);
            // 
            // numberBox
            // 
            this.numberBox.AutoSize = true;
            this.numberBox.Font = new System.Drawing.Font("Century Gothic", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.numberBox.ForeColor = System.Drawing.Color.Coral;
            this.numberBox.Location = new System.Drawing.Point(3, 18);
            this.numberBox.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.numberBox.Name = "numberBox";
            this.numberBox.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.numberBox.Size = new System.Drawing.Size(211, 27);
            this.numberBox.TabIndex = 11;
            this.numberBox.Text = "Include Numbers?";
            this.numberBox.UseVisualStyleBackColor = true;
            this.numberBox.Click += new System.EventHandler(this.numChecked_Checbox);
            // 
            // letterBox
            // 
            this.letterBox.AutoSize = true;
            this.letterBox.Font = new System.Drawing.Font("Century Gothic", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.letterBox.ForeColor = System.Drawing.Color.Coral;
            this.letterBox.Location = new System.Drawing.Point(3, 49);
            this.letterBox.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.letterBox.Name = "letterBox";
            this.letterBox.Size = new System.Drawing.Size(187, 27);
            this.letterBox.TabIndex = 14;
            this.letterBox.Text = "Include Letters?";
            this.letterBox.UseVisualStyleBackColor = true;
            this.letterBox.Click += new System.EventHandler(this.letterBox_Click);
            // 
            // specialBox
            // 
            this.specialBox.AutoSize = true;
            this.specialBox.Font = new System.Drawing.Font("Century Gothic", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.specialBox.ForeColor = System.Drawing.Color.Coral;
            this.specialBox.Location = new System.Drawing.Point(0, 80);
            this.specialBox.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.specialBox.Name = "specialBox";
            this.specialBox.Size = new System.Drawing.Size(311, 27);
            this.specialBox.TabIndex = 16;
            this.specialBox.Text = "Include Special Characters?";
            this.specialBox.UseVisualStyleBackColor = true;
            this.specialBox.Click += new System.EventHandler(this.specialBox_Click);
            // 
            // addPasswordButton
            // 
            this.addPasswordButton.Location = new System.Drawing.Point(309, 231);
            this.addPasswordButton.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.addPasswordButton.Name = "addPasswordButton";
            this.addPasswordButton.Size = new System.Drawing.Size(122, 48);
            this.addPasswordButton.TabIndex = 11;
            this.addPasswordButton.Text = "Add Password";
            this.addPasswordButton.UseVisualStyleBackColor = true;
            this.addPasswordButton.Click += new System.EventHandler(this.addPasswordList);
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox1.Image")));
            this.pictureBox1.Location = new System.Drawing.Point(-1, -1);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(164, 119);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            // 
            // panel5
            // 
            this.panel5.Controls.Add(this.panel6);
            this.panel5.Controls.Add(this.lblUser);
            this.panel5.Controls.Add(this.lblUser2);
            this.panel5.Controls.Add(this.tblTitle);
            this.panel5.Location = new System.Drawing.Point(158, -1);
            this.panel5.Name = "panel5";
            this.panel5.Size = new System.Drawing.Size(439, 119);
            this.panel5.TabIndex = 23;
            // 
            // panel6
            // 
            this.panel6.BackColor = System.Drawing.Color.Red;
            this.panel6.Location = new System.Drawing.Point(345, 0);
            this.panel6.Name = "panel6";
            this.panel6.Size = new System.Drawing.Size(66, 45);
            this.panel6.TabIndex = 4;
            this.panel6.MouseClick += new System.Windows.Forms.MouseEventHandler(this.panel6_MouseClick);
            // 
            // lblUser
            // 
            this.lblUser.AutoSize = true;
            this.lblUser.Font = new System.Drawing.Font("Century Gothic", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblUser.ForeColor = System.Drawing.Color.Coral;
            this.lblUser.Location = new System.Drawing.Point(153, 54);
            this.lblUser.Name = "lblUser";
            this.lblUser.Size = new System.Drawing.Size(86, 30);
            this.lblUser.TabIndex = 3;
            this.lblUser.Text = "label2";
            this.lblUser.Click += new System.EventHandler(this.label2_Click);
            // 
            // lblUser2
            // 
            this.lblUser2.AutoSize = true;
            this.lblUser2.Font = new System.Drawing.Font("Century Gothic", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblUser2.ForeColor = System.Drawing.Color.Coral;
            this.lblUser2.Location = new System.Drawing.Point(10, 54);
            this.lblUser2.Name = "lblUser2";
            this.lblUser2.Size = new System.Drawing.Size(158, 30);
            this.lblUser2.TabIndex = 2;
            this.lblUser2.Text = "Welcome ,  ";
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.specialBox);
            this.panel1.Controls.Add(this.letterBox);
            this.panel1.Controls.Add(this.numberBox);
            this.panel1.Controls.Add(this.lengthBox);
            this.panel1.Controls.Add(this.lblPassword);
            this.panel1.Location = new System.Drawing.Point(-1, 124);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(309, 157);
            this.panel1.TabIndex = 24;
            // 
            // home
            // 
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.None;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(45)))), ((int)(((byte)(45)))), ((int)(((byte)(48)))));
            this.ClientSize = new System.Drawing.Size(572, 283);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.resultButton);
            this.Controls.Add(this.addPasswordButton);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.panel5);
            this.Controls.Add(this.finalResult);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Name = "home";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Password Generator";
            this.Activated += new System.EventHandler(this.home_Activated);
            this.Click += new System.EventHandler(this.numChecked_Checbox);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.panel5.ResumeLayout(false);
            this.panel5.PerformLayout();
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox finalResult;
        private System.Windows.Forms.Label tblTitle;
        private System.Windows.Forms.Label lblPassword;
        private System.Windows.Forms.TextBox lengthBox;
        private System.Windows.Forms.Button resultButton;
        private System.Windows.Forms.CheckBox numberBox;
        private System.Windows.Forms.CheckBox letterBox;
        private System.Windows.Forms.CheckBox specialBox;
        private System.Windows.Forms.Button addPasswordButton;
        private System.Windows.Forms.Panel panel5;
        private System.Windows.Forms.Label lblUser;
        private System.Windows.Forms.Label lblUser2;
        private System.Windows.Forms.Panel panel6;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Panel panel1;
    }
}