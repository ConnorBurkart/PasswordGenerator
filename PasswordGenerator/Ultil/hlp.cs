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


        //Overall Function to make password
        public static string generatePassword(int length)
        {
            Random obj = new Random();
            string final = "";

            for (int i = 0; i < length;i++)
            {
                    final = final + ranLetter(obj);
 
            }
            return final;

        }

        // This is to generate the random letter 
        public static char ranLetter(Random obj)
        {
            char result = ' ';

            char[] alphLlower = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".ToLower().ToCharArray();
            char[] alphLHigher = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".ToCharArray();

            int random = obj.Next(0, 51);

            if (random <= 25)
            {
                result = alphLlower[random];

            }
            else
            {
                random = random - 25;
                result = alphLHigher[random];
            }


            return result;
        }



    }
}
