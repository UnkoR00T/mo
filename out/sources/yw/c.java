package yw;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0006J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010*\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u0010\u0006J\u000f\u00100\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u0010\u0006J\u000f\u00101\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u0010\u0006J\u000f\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\u0006J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u0010\u0006J\u000f\u00104\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u0010\u0006J\u000f\u00105\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u0010\u0006J\u000f\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u0010\u0006J\u000f\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u0010\u0006J\u000f\u00108\u001a\u00020\u0004H\u0016¢\u0006\u0004\b8\u0010\u0006J\u000f\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b:\u0010\u0006J\u0017\u0010;\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b;\u0010\u001bJ\u000f\u0010<\u001a\u00020\u0004H\u0016¢\u0006\u0004\b<\u0010\u0006J\u000f\u0010=\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010\u0006J\u000f\u0010>\u001a\u00020\u0004H\u0016¢\u0006\u0004\b>\u0010\u0006J\u000f\u0010?\u001a\u00020\u0004H\u0016¢\u0006\u0004\b?\u0010\u0006J\u000f\u0010@\u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010\u0006J\u000f\u0010A\u001a\u00020\u0004H\u0016¢\u0006\u0004\bA\u0010\u0006J\u000f\u0010B\u001a\u00020\u0004H\u0016¢\u0006\u0004\bB\u0010\u0006J\u000f\u0010C\u001a\u00020\u0004H\u0016¢\u0006\u0004\bC\u0010\u0006J\u000f\u0010D\u001a\u00020\u0004H\u0016¢\u0006\u0004\bD\u0010\u0006J\u000f\u0010E\u001a\u00020\u0004H\u0016¢\u0006\u0004\bE\u0010\u0006J\u000f\u0010F\u001a\u00020\u0004H\u0016¢\u0006\u0004\bF\u0010\u0006J\u000f\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010\u0006J\u000f\u0010H\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010\u0006J\u001f\u0010K\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0019\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0004H\u0016¢\u0006\u0004\bM\u0010\u0006J\u000f\u0010N\u001a\u00020\u0004H\u0016¢\u0006\u0004\bN\u0010\u0006J\u000f\u0010O\u001a\u00020\u0004H\u0016¢\u0006\u0004\bO\u0010\u0006J\u001f\u0010R\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00182\u0006\u0010Q\u001a\u00020\u0018H\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0019\u001a\u00020IH\u0016¢\u0006\u0004\bT\u0010LJ\u001f\u0010U\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0019\u001a\u00020IH\u0016¢\u0006\u0004\bU\u0010LJ\u000f\u0010V\u001a\u00020\u0004H\u0016¢\u0006\u0004\bV\u0010\u0006J\u0017\u0010W\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bW\u0010XJ'\u0010\\\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00182\u0006\u0010Z\u001a\u00020I2\u0006\u0010[\u001a\u00020IH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u0004H\u0016¢\u0006\u0004\b^\u0010\u0006J\u000f\u0010_\u001a\u00020\u0004H\u0016¢\u0006\u0004\b_\u0010\u0006J\u000f\u0010`\u001a\u00020\u0004H\u0016¢\u0006\u0004\b`\u0010\u0006J\u000f\u0010a\u001a\u00020\u0004H\u0016¢\u0006\u0004\ba\u0010\u0006J/\u0010d\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00182\u0006\u0010Z\u001a\u00020I2\u0006\u0010c\u001a\u00020b2\u0006\u0010[\u001a\u00020IH\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\u0004H\u0016¢\u0006\u0004\bf\u0010\u0006J\u000f\u0010g\u001a\u00020\u0004H\u0016¢\u0006\u0004\bg\u0010\u0006J\u000f\u0010h\u001a\u00020\u0004H\u0016¢\u0006\u0004\bh\u0010\u0006J\u000f\u0010i\u001a\u00020\u0004H\u0016¢\u0006\u0004\bi\u0010\u0006J\u000f\u0010j\u001a\u00020\u0004H\u0016¢\u0006\u0004\bj\u0010\u0006J\u001f\u0010m\u001a\u00020\u00042\u0006\u0010k\u001a\u00020\u00182\u0006\u0010l\u001a\u00020\u0018H\u0016¢\u0006\u0004\bm\u0010SJ\u000f\u0010n\u001a\u00020\u0004H\u0016¢\u0006\u0004\bn\u0010\u0006J\u0017\u0010o\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bo\u0010\u001bJ\u0017\u0010p\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bp\u0010\u001bJ\u000f\u0010q\u001a\u00020\u0004H\u0016¢\u0006\u0004\bq\u0010\u0006J\u0017\u0010s\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u0018H\u0016¢\u0006\u0004\bs\u0010\u001bJ\u0017\u0010u\u001a\u00020\u00042\u0006\u0010t\u001a\u00020\u0018H\u0016¢\u0006\u0004\bu\u0010\u001bJ\u0017\u0010v\u001a\u00020\u00042\u0006\u0010t\u001a\u00020\u0018H\u0016¢\u0006\u0004\bv\u0010\u001bJ\u0017\u0010x\u001a\u00020\u00042\u0006\u0010w\u001a\u00020IH\u0016¢\u0006\u0004\bx\u0010XJ\u001f\u0010{\u001a\u00020\u00042\u0006\u0010y\u001a\u00020I2\u0006\u0010z\u001a\u00020IH\u0016¢\u0006\u0004\b{\u0010LJ\u0017\u0010|\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b|\u0010\u001bJ\u000f\u0010}\u001a\u00020\u0004H\u0016¢\u0006\u0004\b}\u0010\u0006¨\u0006~"}, d2 = {"Lyw/c;", "Lyw/a;", "<init>", "()V", "Lmx/a;", "l", "()Lmx/a;", "a0", "v", "M0", "b", "O0", "Z", "j0", "z0", "r0", "m", "C", "a", "Q", "G", "c0", "q", "g0", "", "arg", "n", "(Ljava/lang/String;)Lmx/a;", "R", "f", "M", "c", "A0", "f0", "Q0", "I0", "i0", "C0", "d", "o0", "t", "l0", "G0", "w0", "k0", "K", "s", i.f37086m, "N0", "m0", "B", "n0", "j", "H0", ip.a.f96138c, "F", "J0", "O", "X", "e0", "u", "q0", "t0", "J", "o", "h0", "N", "F0", "E", "P0", "W", "K0", "v0", "", "quantity", "u0", "(II)Lmx/a;", "y", "d0", "D0", "currentTime", "totalTime", i.f37094u, "(Ljava/lang/String;Ljava/lang/String;)Lmx/a;", i.f37087n, "T", "p", "R0", "(I)Lmx/a;", "title", "position", "listSize", "V", "(Ljava/lang/String;II)Lmx/a;", "p0", "h", "I", "U", "", "isSelected", "x0", "(Ljava/lang/String;IZI)Lmx/a;", "L0", "z", "x", "E0", "A", "start", "end", "b0", "e", "B0", "Y", "k", "extensions", "r", "size", ip.a.f96137b, "i", "limit", "w", "width", "height", "s0", "y0", "g", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements a {
    @Override // yw.a
    public Label A() {
        return mx.b.b("do", "commonTermTo");
    }

    @Override // yw.a
    public Label A0() {
        return mx.b.b("Zwinięty", "notExpanded");
    }

    @Override // yw.a
    public Label B() {
        return mx.b.b("Zaznaczony", "commonAccessibilityChecked");
    }

    @Override // yw.a
    public Label B0(String arg) {
        return mx.b.b("Liczba wpisanych znaków " + arg, "commonAccessibilityTextAreaWritten");
    }

    @Override // yw.a
    public Label C() {
        return mx.b.b("Wyczyść pole", "inputIconRemove");
    }

    @Override // yw.a
    public Label C0() {
        return mx.b.b("Ustawienia", "commonAccessibilitySettings");
    }

    @Override // yw.a
    public Label D() {
        return mx.b.b("Udostępnij odpowied", "commonAccessibilityAnswerShare");
    }

    @Override // yw.a
    public Label D0() {
        return mx.b.b("Odtwarzaj od początku", "commonAccessibilityMediaRepeat");
    }

    @Override // yw.a
    public Label E() {
        return mx.b.b("Pokazano", "Pokazano");
    }

    @Override // yw.a
    public Label E0() {
        return mx.b.b("Od", "commonTermFrom");
    }

    @Override // yw.a
    public Label F() {
        return mx.b.b("Zamknij informację", "commonAccessibilityAnnouncementCloseInformation");
    }

    @Override // yw.a
    public Label F0() {
        return mx.b.b("Telefon", "commonAccessibilityPhone");
    }

    @Override // yw.a
    public Label G() {
        return mx.b.b("Otwiera się w domyślnym kliencie poczty", "linkToEMail");
    }

    @Override // yw.a
    public Label G0() {
        return mx.b.b("Informacja krytyczna", "commonAccessibilityErrorInformation");
    }

    @Override // yw.a
    public Label H(int quantity, int arg) {
        return mx.b.b(quantity + " sekund", "commonAccessibilitySecondsPlural");
    }

    @Override // yw.a
    public Label H0() {
        return mx.b.b("Odpowiedź nie jest pomocna", "commonAccessibilityAnswerUnhelpful");
    }

    @Override // yw.a
    public Label I() {
        return mx.b.b("Przenieś w górę", "commonAccessibilityDragDropMoveUp");
    }

    @Override // yw.a
    public Label I0() {
        return mx.b.b("Edycja", "commonAccessibilityEdit");
    }

    @Override // yw.a
    public Label J() {
        return mx.b.b("Wybrano", "commonAccessibilitySelected");
    }

    @Override // yw.a
    public Label J0() {
        return mx.b.b("Numer kierunkowy", "commonAccessibilityCountryCode");
    }

    @Override // yw.a
    public Label K() {
        return mx.b.b("Zamknij informację ostrzegawczą", "commonAccessibilityCloseWarningInformation");
    }

    @Override // yw.a
    public Label K0() {
        return mx.b.b("Wpisz", "commonAccessibilityPinInputEnter");
    }

    @Override // yw.a
    public Label L(String currentTime, String totalTime) {
        return mx.b.b("Pozycja na ścieżce " + currentTime + " z " + totalTime + ". Aby zmienić wartość, przeciągnij jednym palcem w górę lub dół", "commonAccessibilityTrackPosition");
    }

    @Override // yw.a
    public Label L0() {
        return mx.b.b("Wybierz termin", "commonSelectTerm");
    }

    @Override // yw.a
    public Label M() {
        return mx.b.b("Dowiedz się więcej", "commonAccessibilityFindOutMore");
    }

    @Override // yw.a
    public Label M0() {
        return mx.b.b("Włączono", "onSwitchOff");
    }

    @Override // yw.a
    public Label N() {
        return mx.b.b("Ukryj treść", "commonAccessibilityHideContent");
    }

    @Override // yw.a
    public Label N0() {
        return mx.b.b("Aktualizuj dokument", "commonAccessibilityUpdateDocument");
    }

    @Override // yw.a
    public Label O() {
        return mx.b.b("Flaga Polski", "commonAccessibilityPolishFlag");
    }

    @Override // yw.a
    public Label O0() {
        return mx.b.b("Spełnione wymaganie", "requirementFulfilled");
    }

    @Override // yw.a
    public Label P() {
        return mx.b.b("Zdjęcie właściciela dokumentu", "commonAccessibilityPhoto");
    }

    @Override // yw.a
    public Label P0() {
        return mx.b.b("Ukryto", "commonAccessibilityHidden");
    }

    @Override // yw.a
    public Label Q() {
        return mx.b.b("Otwiera się w zewnętrznej aplikacji", "linkToExternalApp");
    }

    @Override // yw.a
    public Label Q0() {
        return mx.b.b("Status", "commonStatus");
    }

    @Override // yw.a
    public Label R() {
        return mx.b.b("Wróć", "topAppBarArrowBack");
    }

    @Override // yw.a
    public Label R0(int quantity) {
        return mx.b.b("Znaleziono " + quantity + " wyników", "commonAccessibilityResultPlural");
    }

    @Override // yw.a
    public Label S(String size) {
        return mx.b.b("Maksymalny rozmiar pliku: " + size + " MB.", "commonFilePickerMaximumFileSize");
    }

    @Override // yw.a
    public Label T(int quantity, int arg) {
        return mx.b.b(quantity + " minut", "commonAccessibilityMinutesPlural");
    }

    @Override // yw.a
    public Label U() {
        return mx.b.b("Przenieś w dół", "commonAccessibilityDragDropMoveDown");
    }

    @Override // yw.a
    public Label V(String title, int position, int listSize) {
        return mx.b.b("Element " + title + ". Pozycja " + position + " z " + listSize + ".", "commonAccessibilityItemPositionInList");
    }

    @Override // yw.a
    public Label W() {
        return mx.b.b("PIN", "commonAccessibilityPin");
    }

    @Override // yw.a
    public Label X() {
        return mx.b.b("Godło Polski", "commonAccessibilityPolishEmblem");
    }

    @Override // yw.a
    public Label Y(String arg) {
        return mx.b.b("Limit znaków " + arg, "commonAccessibilityTextAreaLimit");
    }

    @Override // yw.a
    public Label Z() {
        return mx.b.b("Niespełnione wymaganie", "requirementUnfulfilled");
    }

    @Override // yw.a
    public Label a() {
        return mx.b.b("Otwiera się w przeglądarce", "linkToWebsite");
    }

    @Override // yw.a
    public Label a0() {
        return mx.b.b("włączony", "onSwitchOn");
    }

    @Override // yw.a
    public Label b() {
        return mx.b.b("Wyłączono", "onSwitchOff");
    }

    @Override // yw.a
    public Label b0(String start, String end) {
        return mx.b.b("Data początkowa: " + start + ". Data końcowa: " + end + ".", "commonAccessibilityDateRangePickerHeadline");
    }

    @Override // yw.a
    public Label c() {
        return mx.b.b("Rozwinięty", "expanded");
    }

    @Override // yw.a
    public Label c0() {
        return mx.b.b("Anuluj", "cancel");
    }

    @Override // yw.a
    public Label d() {
        return mx.b.b("Podgląd zdjęcia", "commonAccessibilityPhotoPreview");
    }

    @Override // yw.a
    public Label d0() {
        return mx.b.b("Pauza", "commonAccessibilityMediaPause");
    }

    @Override // yw.a
    public Label e() {
        return mx.b.b("brak", "commonAccessibilityDateRangePickerNotSelected");
    }

    @Override // yw.a
    public Label e0(String arg) {
        return mx.b.b("Cztery ostatnie cyfry karty to " + arg, "commonAccessibilityCardNumber");
    }

    @Override // yw.a
    public Label f() {
        return mx.b.b("Zamknij", "commonAccessibilityClose");
    }

    @Override // yw.a
    public Label f0() {
        return mx.b.b("Szukaj", "search");
    }

    @Override // yw.a
    public Label g() {
        return mx.b.b("Brak danych", "commonNoData");
    }

    @Override // yw.a
    public Label g0() {
        return mx.b.b("Wybierz datę", "selectDate");
    }

    @Override // yw.a
    public Label h() {
        return mx.b.b("Przeciąganie aktywne. Upuść, aby zakończyć.", "commonAccessibilityDraggingStateDescription");
    }

    @Override // yw.a
    public Label h0() {
        return mx.b.b("Pokaż treść", "commonAccessibilityShowContent");
    }

    @Override // yw.a
    public Label i(String size) {
        return mx.b.b("Maksymalny rozmiar plików: " + size + " MB.", "commonFilePickerMaximumTotalSize");
    }

    @Override // yw.a
    public Label i0() {
        return mx.b.b("Usuń", "commonAccessibilityDelete");
    }

    @Override // yw.a
    public Label j() {
        return mx.b.b("Odpowiedź jest pomocna", "commonAccessibilityAnswerHelpful");
    }

    @Override // yw.a
    public Label j0() {
        return mx.b.b("Włącz animacje", "turnOnAnimations");
    }

    @Override // yw.a
    public Label k() {
        return mx.b.b("Wyświetlono opcje pomocnicze", "commonAccessibilityInputToolbarDisplayed");
    }

    @Override // yw.a
    public Label k0() {
        return mx.b.b("Zamknij informację", "commonAccessibilityCloseInformation");
    }

    @Override // yw.a
    public Label l() {
        return mx.b.b("Przełącznik", "onSwitch");
    }

    @Override // yw.a
    public Label l0() {
        return mx.b.b("Informacja ostrzegawcza", "commonAccessibilityWarningInformation");
    }

    @Override // yw.a
    public Label m() {
        return mx.b.b("Rzeczpospolita\nPolska", "republicOfPoland");
    }

    @Override // yw.a
    public Label m0() {
        return mx.b.b("Usuń plik", "commonAccessibilityDeleteFile");
    }

    @Override // yw.a
    public Label n(String arg) {
        return mx.b.b("Czas: " + arg, "time");
    }

    @Override // yw.a
    public Label n0() {
        return mx.b.b("Odznaczony", "commonAccessibilityUnchecked");
    }

    @Override // yw.a
    public Label o() {
        return mx.b.b("Zlokalizuj mnie", "Zlokalizuj mnie");
    }

    @Override // yw.a
    public Label o0() {
        return mx.b.b("Podgląd pliku", "commonAccessibilityFilePreview");
    }

    @Override // yw.a
    public Label p() {
        return mx.b.b("Brak wyników wyszukiwania", "commonAccessibilitySearchNoResults");
    }

    @Override // yw.a
    public Label p0() {
        return mx.b.b("Kliknij dwukrotnie i przytrzymaj, aby przeciągnąć.", "commonAccessibilityStateDescriptionDragging");
    }

    @Override // yw.a
    public Label q() {
        return mx.b.b("OK", "ok");
    }

    @Override // yw.a
    public Label q0() {
        return mx.b.b("Plik został dodany.", "commonAccessibilityFileAdded");
    }

    @Override // yw.a
    public Label r(String extensions) {
        return mx.b.b("Dopuszczalne\u0a00formaty: " + extensions + ".", "commonFilePickerAllowedFileExtensions");
    }

    @Override // yw.a
    public Label r0() {
        return mx.b.b("Zamknij", "close");
    }

    @Override // yw.a
    public Label s() {
        return mx.b.b("Zamknij informację pozytywną", "commonAccessibilityCloseSuccessInformation");
    }

    @Override // yw.a
    public Label s0(int width, int height) {
        return mx.b.b("Minimalna rozdzielczość: " + width + " x " + height + "\u2063.", "commonFilePickerMinResolution");
    }

    @Override // yw.a
    public Label t() {
        return mx.b.b("Informacja", "commonAccessibilityInformation");
    }

    @Override // yw.a
    public Label t0() {
        return mx.b.b("Kod QR", "commonAccessibilityQrCode");
    }

    @Override // yw.a
    public Label u() {
        return mx.b.b("Usuń karty", "commonAccessibilityDeleteCards");
    }

    @Override // yw.a
    public Label u0(int quantity, int arg) {
        return mx.b.b(quantity + " znaków", "commonAccessibilityCharactersPlural");
    }

    @Override // yw.a
    public Label v() {
        return mx.b.b("wyłączony", "onSwitchOff");
    }

    @Override // yw.a
    public Label v0() {
        return mx.b.b("Wpisano", "commonAccessibilityPinInputEntered");
    }

    @Override // yw.a
    public Label w(int limit) {
        return mx.b.b("Dopuszczalna liczba plików: " + limit + "\u2063.", "commonFilePickerSelectionLimit");
    }

    @Override // yw.a
    public Label w0() {
        return mx.b.b("Informacja pozytywna", "commonAccessibilitySuccessInformation");
    }

    @Override // yw.a
    public Label x() {
        return mx.b.b("Zmień", "commonChange");
    }

    @Override // yw.a
    public Label x0(String title, int position, boolean isSelected, int listSize) {
        return mx.b.b("Nazwa zakładki, wybrana zakładka, 2 z 2", "commonAccessibilityControllerSwitchElement");
    }

    @Override // yw.a
    public Label y() {
        return mx.b.b("Odtwarzaj", "commonAccessibilityMediaPlay");
    }

    @Override // yw.a
    public Label y0(String arg) {
        return mx.b.b("Zadzwoń na " + arg, "commonAccessibilityCallOn");
    }

    @Override // yw.a
    public Label z() {
        return mx.b.b("Dzisiaj", "commonToday");
    }

    @Override // yw.a
    public Label z0() {
        return mx.b.b("Wyłącz animacje", "turnOffAnimations");
    }
}
