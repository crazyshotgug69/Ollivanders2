package net.pottercraft.Ollivanders2.Book;

import net.pottercraft.Ollivanders2.O2MagicBranch;
import net.pottercraft.Ollivanders2.Spell.Spells;
import net.pottercraft.Ollivanders2.Ollivanders2;

/**
 * Year with a Yeti - 2nd year Defense Against the Dark Arts book
 *
 * Missing spells:
 * Mimblewimble - https://github.com/Azami7/Ollivanders2/issues/54
 *
 * @since 2.2.4
 * @author Azami7
 */
public class YEAR_WITH_A_YETI extends O2Book
{
   public YEAR_WITH_A_YETI (Ollivanders2 plugin)
   {
      super(plugin);

      title = shortTitle = "Year with a Yeti";
      author = "Gilderoy Lockhart";
      branch = O2MagicBranch.DARK_ARTS;

      spells.add(Spells.ARANIA_EXUMAI);
      spells.add(Spells.OBLIVIATE);
   }
}
