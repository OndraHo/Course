# Fronta //TODO: format
Připravte data pro registrační aplikaci, realizující frontu u lékaře. Vaše aplikace by měla podporovat následující operace:
     * Připravte metody, které realizují jednotlivé operace. Připravte také třídy, které popisují data, se kterými pracujeme.
1. Registrace pacienta (jméno, datum narození, pohlaví, adresa).
        * v rámci registrace aplikace pacientovi přiřadí identifikační číslo.
2. Objednání pacienta k lékaři na dané datum (zadává se popis problému a typ žádosti: akutní | objednání léků | nemoc | prevence).
        * Objednání by se v praxi zařídilo on-line, například z mobilního telefonu. Ale my si na to připravíme metodu, kterou ručně zavoláme.
3. Příchod do čekárny (od tohoto okamžiku může lékař pacienta zavolat do ordinace).
    * Opět zavoláme připravenou metodu (v praxi by se vyvolala z ovládacího terminálu nebo obdobného zařízení)
    * Pacienta vložíme do seznamu čekajících pacientů.
    * Na obrazovku se vypíše pořadové číslo pacienta v seznamu.
4. Vyvolání dalšího pacienta z čekárny.
    * Vypíše na světelnou tabuli (u nás textově na obrazovku) jméno pacienta, který je na řadě.
    * Vyřadí pacienta ze seznamu čekajících pacientů.
Rozšíření
5. Vyvolání konkrétního pacienta pomocí zadaného jména nebo pořadového čísla.
6. Výpis všech pacientů ve frontě.