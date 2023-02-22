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
            this.title = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.lengthBox = new System.Windows.Forms.TextBox();
            this.resultButton = new System.Windows.Forms.Button();
            this.numberBox = new System.Windows.Forms.CheckBox();
            this.letterBox = new System.Windows.Forms.CheckBox();
            this.specialBox = new System.Windows.Forms.CheckBox();
            this.SuspendLayout();
            // 
            // finalResult
            // 
            this.finalResult.Location = new System.Drawing.Point(523, 92);
            this.finalResult.Name = "finalResult";
            this.finalResult.Size = new System.Drawing.Size(201, 22);
            this.finalResult.TabIndex = 0;
            // 
            // title
            // 
            this.title.AutoSize = true;
            this.title.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.title.Location = new System.Drawing.Point(12, 9);
            this.title.Name = "title";
            this.title.Size = new System.Drawing.Size(305, 36);
            this.title.TabIndex = 1;
            this.title.Text = "Passoword Generator";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(12, 202);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(139, 20);
            this.label1.TabIndex = 2;
            this.label1.Text = "Password Length";
            // 
            // lengthBox
            // 
            this.lengthBox.Location = new System.Drawing.Point(182, 200);
            this.lengthBox.Name = "lengthBox";
            this.lengthBox.Size = new System.Drawing.Size(29, 22);
            this.lengthBox.TabIndex = 10;
            // 
            // resultButton
            // 
            this.resultButton.Location = new System.Drawing.Point(560, 390);
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
            this.numberBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.numberBox.Location = new System.Drawing.Point(16, 250);
            this.numberBox.Name = "numberBox";
            this.numberBox.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.numberBox.Size = new System.Drawing.Size(166, 24);
            this.numberBox.TabIndex = 11;
            this.numberBox.Text = "Include Numbers?";
            this.numberBox.UseVisualStyleBackColor = true;
            this.numberBox.Click += new System.EventHandler(this.numChecked_Checbox);
            // 
            // letterBox
            // 
            this.letterBox.AutoSize = true;
            this.letterBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.letterBox.Location = new System.Drawing.Point(16, 292);
            this.letterBox.Name = "letterBox";
            this.letterBox.Size = new System.Drawing.Size(151, 24);
            this.letterBox.TabIndex = 14;
            this.letterBox.Text = "Include Letters?";
            this.letterBox.UseVisualStyleBackColor = true;
            this.letterBox.Click += new System.EventHandler(this.letterBox_Click);
            // 
            // specialBox
            // 
            this.specialBox.AutoSize = true;
            this.specialBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.specialBox.Location = new System.Drawing.Point(16, 334);
            this.specialBox.Name = "specialBox";
            this.specialBox.Size = new System.Drawing.Size(241, 24);
            this.specialBox.TabIndex = 16;
            this.specialBox.Text = "Include Special Characters?";
            this.specialBox.UseVisualStyleBackColor = true;
            this.specialBox.Click += new System.EventHandler(this.specialBox_Click);
            // 
            // home
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.specialBox);
            this.Controls.Add(this.letterBox);
            this.Controls.Add(this.numberBox);
            this.Controls.Add(this.resultButton);
            this.Controls.Add(this.lengthBox);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.title);
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
        private System.Windows.Forms.Label title;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox lengthBox;
        private System.Windows.Forms.Button resultButton;
        private System.Windows.Forms.CheckBox numberBox;
        private System.Windows.Forms.CheckBox letterBox;
        private System.Windows.Forms.CheckBox specialBox;
    }
}