using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PasswordGenerator
{
    internal static class hlp
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new home());
        }

        public static string generatePassword(int length)
        {

            string final = "";
            char[] alphLlower = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".ToLower().ToCharArray();
            char[] alphLHigher = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".ToCharArray();
            Random obj = new Random();


            for (int i = 0; i < length;i++)
            {
                int random = obj.Next(0, 51);

                if (random <= 25)
                {
                    final = final + alphLlower[random];

                }
                else
                {
                    random = random - 25;
                    final = final + alphLHigher[random];
                    

                }
            }



            return final;


        }
    }
}
