Keep It Simple Stupid (No Really)
=================================

By: Kyle Eggleston

<table class="revision" width="100%">
  <caption>Revisions of this Document</caption>
  <thead>
    <tr>
      <th>Revision</th>
      <th>Date</th>
      <th>Author</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>1.01</td>
      <td>03.16.2014</td>
      <td>Kyle</td>
    </tr>
    <tr>
      <td colspan="3">Added Tutorial Section</td>
    </tr>
    <tr>
      <td>1.0</td>
      <td>03.04.2014</td>
      <td>Kyle</td>
    </tr>
    <tr>
      <td colspan="3">Created Document</td>
    </tr>
  </tbody>
</table>

From time to time I find it amusing what kind of code can be written and what code actually gets passed through to a production setting. Most of the time it's something I've written myself. Ever look back to a project you worked on a long time ago? That's a scary thought now isn't it? You take a look back and go... how did that ever work? You also might think, what in the world was I thinking when I coded that?

## Awful Markup

Back when I first started learning HTML it was the standard to have all of your tags in uppercase. Uppercase! I suppose someone wanted to establish content from presentation or structure. Yeah structure. HTML isn't a presentation layer, that would be CSS. Looking back at that code I cringe. Why would anyone ever even want to code in all uppercase? It didn't make any sense. Not only does it hurt the eyes to look at it, but it's also hard to read.

## Method Lengths

How long should a method be exactly? I've read that methods should be a few lines long. Don't write hundreds of lines in a single method. You'd go crazy nuts trying to find a bug in there! No really. Be like searching for a needle in a haystack. Don't try it. You'll go blind.

Just keep your methods/functions short and simple. I'd rather look at several methods with a few lines of code than a few methods with lots of lines of code in them. What's going on where? Make it easy and simple to understand.


## Comments

Make your code self documenting. Don't flood it with unneccessary comments. If you want a method to return a string in HTML format, name it like that. Instead of `getContent()` call it `getContentAsHtml()`. Makes sense right? Whoever is looking at the source code later on down the line won't wonder what format the content will be returned as.

## Documentation

Provide adequate documenation. Don't write novels with your documentation. But write what is needed to get someone started. You know how projects have a two minute get started guide? Yep do that. If it's a <code>Java</code> project, have `Javadocs` available for it. You don't want to have your users in the dark about what your project does.

## Write Tutorials Smart

If you're going to write a website that contains tutorials. Um, keep them simple and easy to follow. Also keep with the actual current standards. I should say that again. Keep with the current standards.

If you're going to write a website that contains tutorials. Um, keep them simple and easy to follow. Also keep with the actual current standards. I should say that again. Keep with the current standards.

An example of this. Years ago, it was typical to have your HTML markup in uppercase. That isn't the case anymore (no pun intended... or was there?). No realy though. Do not put your HTML in upper case. Don't! It's bad. You will be looked down upon so bad. So very very bad. Keep current with whatever language you're running with and be good at it. Seriously do it. You can deprecate things, that's just fine. Most languages have a way to do that. Use it!