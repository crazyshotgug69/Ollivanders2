package net.pottercraft.Ollivanders2.Book;

import net.pottercraft.Ollivanders2.O2MagicBranch;
import net.pottercraft.Ollivanders2.Spell.Spells;
import net.pottercraft.Ollivanders2.Ollivanders2;

/**
 * Modern Magical Transportation
 *
 * @since 2.2.4
 * @author Azami7
 */
public class MODERN_MAGICAL_TRANSPORTATION extends O2Book
{
   public MODERN_MAGICAL_TRANSPORTATION (Ollivanders2 plugin)
   {
      super(plugin);

      shortTitle = "Magical Transportation";
      title = "Modern Magical Transportation";
      author = "Azami7";
      branch = O2MagicBranch.CHARMS;

      openingPage = "Understanding magical transportation is important for every witch and wizard.  In this book we will learn three primary means of transport - Brooms, Floo Powder, and Portkeys.";

      spells.add(Spells.VOLATUS);
      spells.add(Spells.ALIQUAM_FLOO);
      spells.add(Spells.PORTUS);
   }
}
