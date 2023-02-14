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
        public static string generatePassword(int length, bool letter,bool num, bool spec)
        {
            Random obj = new Random();
            string final = "";
            

            // This is the ultimate case
            if(letter == true && num == true)
            {
                for (int i = 0; i < length; i++)
                {
                    final = final + randomVariable(obj);

                }
                return final;

            }
            else if(num == true)
            {
                for (int i = 0; i < length; i++)
                {
                    final = final + ranNum(obj);

                }
                return final;
            }
            else if(letter == true)
            {
                for (int i = 0; i < length; i++)
                {
                    final = final + ranLetter(obj);

                }
                return final;

            }
            else if(spec == true)
            {
                for (int i = 0; i < length; i++)
                {
                    final = final + ranSpecial(obj);

                }
                return final;
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
        // This is used for random numbers
        public static char ranNum(Random obj)
        {
            char[] numArray = "0123456789".ToCharArray();

            int random = obj.Next(0, 9);

            char final = ' ';

            final = numArray[random];

            return final;
        }
        // This is a mix for the ultiamte 
        public static char randomVariable(Random obj)
        {
            int random = obj.Next(0, 79);
            char final = ' ';

            if (random <= 51 && random >= 0)
            {
                final = ranLetter(obj);
            }
            else if (52 <= random && random <= 67)
            {
                final = ranNum(obj);
            }
            else if(68 <= random && random <= 79)
            {
                final = ranSpecial(obj);
            }

            return final;

        }

        public static char ranSpecial(Random obj)
        {
            char[] specArray = "!@#$%^&*_-+=/|?<>'".ToCharArray();

            int specArrayLength = specArray.Length;

            int random = obj.Next(0, specArrayLength);

            char final = ' ';

            final = specArray[random];

            return final;
        }



    }
}
