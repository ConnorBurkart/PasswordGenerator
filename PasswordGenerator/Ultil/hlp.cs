using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Diagnostics.Contracts;
using System.Linq;
using System.Runtime.InteropServices;
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
            
            if(num == false && letter == false && spec == false)
            {
                MessageBox.Show("Please Use a CheckBox");

            }

            // This is the ultimate case
            if(letter == true && num == true && spec == true)
            {
                for (int i = 0; i < length; i++)
                {
                    final = final + randomVariable(obj);

                }
                return checkFinal(final,obj,spec);

            }
            else if(letter == true && num == true)
            {
                int random;

                for(int i = 0; i < length; i++)
                {
                    random = obj.Next(0, 99);

                    if (random < 49)
                    {
                        final= final + ranLetter(obj);
                    }
                    else
                    {
                        final = final + ranNum(obj);
                    }


                }
            }
            else if(num == true && spec == true)
            {
                int random;

                for (int i = 0; i < length; i++)
                {
                    random = obj.Next(0, 99);

                    if (random < 49)
                    {
                        final = final + ranSpecial(obj);
                    }
                    else
                    {
                        final = final + ranNum(obj);
                    }


                }
            }
            else if(letter == true && spec == true)
            {

                int random;

                for (int i = 0; i < length; i++)
                {
                    random = obj.Next(0, 99);

                    if (random < 49)
                    {
                        final = final + ranSpecial(obj);
                    }
                    else
                    {
                        final = final + ranLetter(obj);
                    }

                }


            }
            else if(num == true)
            {
                for (int i = 0; i < length; i++)
                {
                    final = final + ranNum(obj);

                }
                return checkFinal(final, obj, spec);
            }
            else if(letter == true)
            {
                for (int i = 0; i < length; i++)
                {
                    final = final + ranLetter(obj);

                }
                return checkFinal(final, obj, spec);

            }
            else if(spec == true)
            {
                for (int i = 0; i < length; i++)
                {
                    final = final + ranSpecial(obj);

                }
                return checkFinal(final, obj, spec);
            }


            return checkFinal(final, obj, spec);


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

        // This is to make sure the final has at least two special characters

        public static string checkFinal(string final,Random obj,bool special)
        {

            if(special == false)
            {
                return final;
            }

            int specMark = 0;
            int finalLength = final.Length;
            int halfFinal = finalLength / 2;
            char[] specArray = "!@#$%^&*_-+=/|?<>'".ToCharArray();
            string newPassword = "";


            // Sees how many special characters there are
            for (int i = 0; i < finalLength;i++)
            { 
                for(int j = 0; j < specArray.Length; j++)
                {
                    if (final[i] == specArray[j] )
                    {
                        specMark++;
                    }
                }

            }

            // IF there are 0 speical characters add two of them
            // We split the string in half and add them to each end
            // Then reattach them.
            if (specMark == 0 && finalLength >= 6)
            {

                string temp = "";
                string temp2 = "";

                for (int q = 0; q < finalLength; q++)
                {

                    if(q < halfFinal)
                    {
                        temp += final[q];

                    }
                    else
                    {
                        temp2+= final[q];
                    }

                }

                temp = temp.Remove(temp.Length - 1);
                temp2 = temp2.Remove(temp2.Length-1);
                temp = temp + ranSpecial(obj);

                temp2 = temp2 + ranSpecial(obj);

                newPassword = temp + temp2;

                return newPassword;


            }

            // If only one add it at the end
            if (finalLength >= 6 && specMark == 1)
            {
                newPassword = final;

                newPassword = newPassword + ranSpecial(obj);

                return newPassword;


            }

            return final;
        }

            
     }

           



 }

