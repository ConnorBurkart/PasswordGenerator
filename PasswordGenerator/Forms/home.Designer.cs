namespace PasswordGenerator
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
            this.finalResult = new System.Windows.Forms.TextBox();
            this.tblTitle = new System.Windows.Forms.Label();
            this.lblPassword = new System.Windows.Forms.Label();
            this.lengthBox = new System.Windows.Forms.TextBox();
            this.resultButton = new System.Windows.Forms.Button();
            this.numberBox = new System.Windows.Forms.CheckBox();
            this.letterBox = new System.Windows.Forms.CheckBox();
            this.specialBox = new System.Windows.Forms.CheckBox();
            this.addPasswordButton = new System.Windows.Forms.Button();
            this.panel1 = new System.Windows.Forms.Panel();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // finalResult
            // 
            this.finalResult.Anchor = System.Windows.Forms.AnchorStyles.Left;
            this.finalResult.Location = new System.Drawing.Point(411, 85);
            this.finalResult.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.finalResult.Name = "finalResult";
            this.finalResult.ReadOnly = true;
            this.finalResult.Size = new System.Drawing.Size(201, 22);
            this.finalResult.TabIndex = 0;
            // 
            // tblTitle
            // 
            this.tblTitle.AutoSize = true;
            this.tblTitle.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tblTitle.Location = new System.Drawing.Point(12, 9);
            this.tblTitle.Name = "tblTitle";
            this.tblTitle.Size = new System.Drawing.Size(305, 36);
            this.tblTitle.TabIndex = 1;
            this.tblTitle.Text = "Passoword Generator";
            // 
            // lblPassword
            // 
            this.lblPassword.AutoSize = true;
            this.lblPassword.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPassword.Location = new System.Drawing.Point(3, 12);
            this.lblPassword.Name = "lblPassword";
            this.lblPassword.Size = new System.Drawing.Size(174, 25);
            this.lblPassword.TabIndex = 2;
            this.lblPassword.Text = "Password Length: ";
            // 
            // lengthBox
            // 
            this.lengthBox.Anchor = System.Windows.Forms.AnchorStyles.Left;
            this.lengthBox.Location = new System.Drawing.Point(195, 15);
            this.lengthBox.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.lengthBox.Name = "lengthBox";
            this.lengthBox.Size = new System.Drawing.Size(32, 22);
            this.lengthBox.TabIndex = 20;
            // 
            // resultButton
            // 
            this.resultButton.Location = new System.Drawing.Point(8, 158);
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
            this.numberBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.numberBox.Location = new System.Drawing.Point(8, 44);
            this.numberBox.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.numberBox.Name = "numberBox";
            this.numberBox.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.numberBox.Size = new System.Drawing.Size(192, 29);
            this.numberBox.TabIndex = 11;
            this.numberBox.Text = "Include Numbers?";
            this.numberBox.UseVisualStyleBackColor = true;
            this.numberBox.Click += new System.EventHandler(this.numChecked_Checbox);
            // 
            // letterBox
            // 
            this.letterBox.AutoSize = true;
            this.letterBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.letterBox.Location = new System.Drawing.Point(8, 79);
            this.letterBox.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.letterBox.Name = "letterBox";
            this.letterBox.Size = new System.Drawing.Size(172, 29);
            this.letterBox.TabIndex = 14;
            this.letterBox.Text = "Include Letters?";
            this.letterBox.UseVisualStyleBackColor = true;
            this.letterBox.Click += new System.EventHandler(this.letterBox_Click);
            // 
            // specialBox
            // 
            this.specialBox.AutoSize = true;
            this.specialBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.specialBox.Location = new System.Drawing.Point(8, 113);
            this.specialBox.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.specialBox.Name = "specialBox";
            this.specialBox.Size = new System.Drawing.Size(279, 29);
            this.specialBox.TabIndex = 16;
            this.specialBox.Text = "Include Special Characters?";
            this.specialBox.UseVisualStyleBackColor = true;
            this.specialBox.Click += new System.EventHandler(this.specialBox_Click);
            // 
            // addPasswordButton
            // 
            this.addPasswordButton.Location = new System.Drawing.Point(619, 85);
            this.addPasswordButton.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.addPasswordButton.Name = "addPasswordButton";
            this.addPasswordButton.Size = new System.Drawing.Size(149, 27);
            this.addPasswordButton.TabIndex = 11;
            this.addPasswordButton.Text = "Add Password";
            this.addPasswordButton.UseVisualStyleBackColor = true;
            this.addPasswordButton.Click += new System.EventHandler(this.addPasswordList);
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.lblPassword);
            this.panel1.Controls.Add(this.lengthBox);
            this.panel1.Controls.Add(this.numberBox);
            this.panel1.Controls.Add(this.resultButton);
            this.panel1.Controls.Add(this.specialBox);
            this.panel1.Controls.Add(this.letterBox);
            this.panel1.Location = new System.Drawing.Point(1, 148);
            this.panel1.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(341, 208);
            this.panel1.TabIndex = 21;
            // 
            // home
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(800, 370);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.addPasswordButton);
            this.Controls.Add(this.tblTitle);
            this.Controls.Add(this.finalResult);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Name = "home";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Password Generator";
            this.Click += new System.EventHandler(this.numChecked_Checbox);
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
        private System.Windows.Forms.Panel panel1;
    }
}