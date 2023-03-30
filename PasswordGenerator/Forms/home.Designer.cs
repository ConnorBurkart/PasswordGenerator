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
            this.btseeList = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // finalResult
            // 
            this.finalResult.Anchor = System.Windows.Forms.AnchorStyles.Left;
            this.finalResult.Location = new System.Drawing.Point(411, 85);
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
            this.tblTitle.Size = new System.Drawing.Size(248, 29);
            this.tblTitle.TabIndex = 1;
            this.tblTitle.Text = "Passoword Generator";
            // 
            // lblPassword
            // 
            this.lblPassword.AutoSize = true;
            this.lblPassword.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPassword.Location = new System.Drawing.Point(8, 148);
            this.lblPassword.Name = "lblPassword";
            this.lblPassword.Size = new System.Drawing.Size(140, 20);
            this.lblPassword.TabIndex = 2;
            this.lblPassword.Text = "Password Length: ";
            // 
            // lengthBox
            // 
            this.lengthBox.Anchor = System.Windows.Forms.AnchorStyles.Left;
            this.lengthBox.Location = new System.Drawing.Point(189, 148);
            this.lengthBox.Name = "lengthBox";
            this.lengthBox.Size = new System.Drawing.Size(32, 22);
            this.lengthBox.TabIndex = 20;
            // 
            // resultButton
            // 
            this.resultButton.Location = new System.Drawing.Point(150, 311);
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
            this.numberBox.Location = new System.Drawing.Point(12, 193);
            this.numberBox.Name = "numberBox";
            this.numberBox.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.numberBox.Size = new System.Drawing.Size(157, 24);
            this.numberBox.TabIndex = 11;
            this.numberBox.Text = "Include Numbers?";
            this.numberBox.UseVisualStyleBackColor = true;
            this.numberBox.Click += new System.EventHandler(this.numChecked_Checbox);
            // 
            // letterBox
            // 
            this.letterBox.AutoSize = true;
            this.letterBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.letterBox.Location = new System.Drawing.Point(12, 235);
            this.letterBox.Name = "letterBox";
            this.letterBox.Size = new System.Drawing.Size(143, 24);
            this.letterBox.TabIndex = 14;
            this.letterBox.Text = "Include Letters?";
            this.letterBox.UseVisualStyleBackColor = true;
            this.letterBox.Click += new System.EventHandler(this.letterBox_Click);
            // 
            // specialBox
            // 
            this.specialBox.AutoSize = true;
            this.specialBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.specialBox.Location = new System.Drawing.Point(12, 277);
            this.specialBox.Name = "specialBox";
            this.specialBox.Size = new System.Drawing.Size(227, 24);
            this.specialBox.TabIndex = 16;
            this.specialBox.Text = "Include Special Characters?";
            this.specialBox.UseVisualStyleBackColor = true;
            this.specialBox.Click += new System.EventHandler(this.specialBox_Click);
            // 
            // addPasswordButton
            // 
            this.addPasswordButton.Location = new System.Drawing.Point(618, 85);
            this.addPasswordButton.Name = "addPasswordButton";
            this.addPasswordButton.Size = new System.Drawing.Size(149, 27);
            this.addPasswordButton.TabIndex = 11;
            this.addPasswordButton.Text = "Add Password";
            this.addPasswordButton.UseVisualStyleBackColor = true;
            this.addPasswordButton.Click += new System.EventHandler(this.addPasswordList);
            // 
            // btseeList
            // 
            this.btseeList.Location = new System.Drawing.Point(12, 311);
            this.btseeList.Name = "btseeList";
            this.btseeList.Size = new System.Drawing.Size(132, 48);
            this.btseeList.TabIndex = 17;
            this.btseeList.Text = "View List";
            this.btseeList.UseVisualStyleBackColor = true;
            this.btseeList.Click += new System.EventHandler(this.button1_Click);
            // 
            // home
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(800, 371);
            this.Controls.Add(this.btseeList);
            this.Controls.Add(this.addPasswordButton);
            this.Controls.Add(this.specialBox);
            this.Controls.Add(this.letterBox);
            this.Controls.Add(this.numberBox);
            this.Controls.Add(this.resultButton);
            this.Controls.Add(this.lengthBox);
            this.Controls.Add(this.lblPassword);
            this.Controls.Add(this.tblTitle);
            this.Controls.Add(this.finalResult);
            this.Name = "home";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Password Generator";
            this.Click += new System.EventHandler(this.numChecked_Checbox);
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
        private System.Windows.Forms.Button btseeList;
    }
}