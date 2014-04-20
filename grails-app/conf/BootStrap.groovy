import com.deigote.grails.Author

class BootStrap {

    def init = { servletContext ->
       createMyFavoriteAuthor()
    }

   private Author createMyFavoriteAuthor() {
      [
         "Apt Pupil": "0140869352",
         "Apt Pupil Unabridged CDs": "0142428035",
         "Bare Bones: Conversations on Terror With Stephen King": "0070657599",
         "BLACK HOUSE": "0007100426",
         "Black House": "0007100442",
         "The Body": "0141800127",
         "The Breathing Method": "0140869441",
         "The Breathing Method Unabridged CDs": "0142428051",
         "Cujo": "0142427853",
         "Desperation": "0140863184",
         "The Eyes of the Dragon Unabridged CD's": "0142427888",
         "Firestarter Unabridged CD's": "0142427845",
         "The Green Mile: Coffey's Hands": "0140863796",
         "The Green Mile: The Bad Death of Eduard Delacroix": "014086380X",
         "The Green Mile: The Two Dead Girls": "014086377X",
         "The Body Unabridged CDs": "0142428043",
         "It Unabridged CD's": "014242787X",
         "The Long Walk Unabridged CD's": "0142427837",
         "Misery": "0140814108",
         "Night Journey The Green Mile Part 5": "0140258604",
         "Nightmares and Dreamscapes: Suffer the Little Children/Crouch End/Rainy Season/Dolan's Cadillac": "0140860703",
         "Nightmares in the Sky": "0140265651",
         "The Regulators": "0140863222",
         "Road Rage CD": "0061726354",
         "Roadwork": "0142427861",
         "Rose Madder": "0140861580",
         "The Shawshank Redemption Unabridged CDs": "0142428027",
         "Thinner Audio": "0140866299",
         "Thinner [UNABRIDGED]": "0140862668",
      ].inject(Author.findOrCreateByName('Stephen King')) { author, title, isbn ->
         if (!author.books.containsKey(isbn)) {
            author.books[isbn] = title
         }
         author
      }.save(failOnError: true)
   }

   def destroy = {
   }
}
