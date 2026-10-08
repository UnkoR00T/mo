package b24;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import java.util.Arrays;
import mx.Label;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\bE\n\u0002\u0010\u000b\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u0014J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u0014J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\u0014J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\u0014J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0014J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u0014J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\r\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\u0014J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010\u0014J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\u0014J\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\u0014J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\u0014J\u000f\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\u0014J\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\u0014J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\u0014J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0014J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u0014J\u000f\u00103\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\u0014J\u000f\u00104\u001a\u00020\bH\u0016¢\u0006\u0004\b4\u0010\u0014J\u000f\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u0010\u0014J\u000f\u00106\u001a\u00020\bH\u0016¢\u0006\u0004\b6\u0010\u0014J\u000f\u00107\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u0010\u0014J\u000f\u00108\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u0010\u0014J\u000f\u00109\u001a\u00020\bH\u0016¢\u0006\u0004\b9\u0010\u0014J\u000f\u0010:\u001a\u00020\bH\u0016¢\u0006\u0004\b:\u0010\u0014J\u000f\u0010;\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010\u0014J\u000f\u0010<\u001a\u00020\bH\u0016¢\u0006\u0004\b<\u0010\u0014J\u000f\u0010=\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010\u0014J\u000f\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b>\u0010\u0014J\u000f\u0010?\u001a\u00020\bH\u0016¢\u0006\u0004\b?\u0010\u0014J\u000f\u0010@\u001a\u00020\bH\u0016¢\u0006\u0004\b@\u0010\u0014J\u000f\u0010A\u001a\u00020\bH\u0016¢\u0006\u0004\bA\u0010\u0014J\u000f\u0010B\u001a\u00020\bH\u0016¢\u0006\u0004\bB\u0010\u0014J\u000f\u0010C\u001a\u00020\bH\u0016¢\u0006\u0004\bC\u0010\u0014J\u000f\u0010D\u001a\u00020\bH\u0016¢\u0006\u0004\bD\u0010\u0014J\u000f\u0010E\u001a\u00020\bH\u0016¢\u0006\u0004\bE\u0010\u0014J\u000f\u0010F\u001a\u00020\bH\u0016¢\u0006\u0004\bF\u0010\u0014J\u000f\u0010G\u001a\u00020\bH\u0016¢\u0006\u0004\bG\u0010\u0014J\u0017\u0010H\u001a\u00020\b2\u0006\u0010\r\u001a\u00020&H\u0016¢\u0006\u0004\bH\u0010(J\u000f\u0010I\u001a\u00020\bH\u0016¢\u0006\u0004\bI\u0010\u0014J\u000f\u0010J\u001a\u00020\bH\u0016¢\u0006\u0004\bJ\u0010\u0014J\u000f\u0010K\u001a\u00020\bH\u0016¢\u0006\u0004\bK\u0010\u0014J\u000f\u0010L\u001a\u00020\bH\u0016¢\u0006\u0004\bL\u0010\u0014J\u000f\u0010M\u001a\u00020\bH\u0016¢\u0006\u0004\bM\u0010\u0014J\u000f\u0010N\u001a\u00020\bH\u0016¢\u0006\u0004\bN\u0010\u0014J\u000f\u0010O\u001a\u00020\bH\u0016¢\u0006\u0004\bO\u0010\u0014J\u000f\u0010P\u001a\u00020\bH\u0016¢\u0006\u0004\bP\u0010\u0014J\u000f\u0010Q\u001a\u00020\bH\u0016¢\u0006\u0004\bQ\u0010\u0014J\u000f\u0010R\u001a\u00020\bH\u0016¢\u0006\u0004\bR\u0010\u0014J\u000f\u0010S\u001a\u00020\bH\u0016¢\u0006\u0004\bS\u0010\u0014J\u000f\u0010T\u001a\u00020\bH\u0016¢\u0006\u0004\bT\u0010\u0014J\u000f\u0010U\u001a\u00020\bH\u0016¢\u0006\u0004\bU\u0010\u0014J\u001f\u0010V\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\bH\u0016¢\u0006\u0004\bX\u0010\u0014J\u000f\u0010Y\u001a\u00020\bH\u0016¢\u0006\u0004\bY\u0010\u0014J\u000f\u0010Z\u001a\u00020\bH\u0016¢\u0006\u0004\bZ\u0010\u0014J\u001f\u0010]\u001a\u00020\b2\u0006\u0010[\u001a\u00020&2\u0006\u0010\\\u001a\u00020&H\u0016¢\u0006\u0004\b]\u0010^J\u001f\u0010_\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b_\u0010WJ\u001f\u0010`\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b`\u0010WJ\u000f\u0010a\u001a\u00020\bH\u0016¢\u0006\u0004\ba\u0010\u0014J\u0017\u0010b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\bb\u0010\nJ'\u0010f\u001a\u00020\b2\u0006\u0010c\u001a\u00020&2\u0006\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0006H\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\bH\u0016¢\u0006\u0004\bh\u0010\u0014J\u000f\u0010i\u001a\u00020\bH\u0016¢\u0006\u0004\bi\u0010\u0014J\u000f\u0010j\u001a\u00020\bH\u0016¢\u0006\u0004\bj\u0010\u0014J\u000f\u0010k\u001a\u00020\bH\u0016¢\u0006\u0004\bk\u0010\u0014J/\u0010n\u001a\u00020\b2\u0006\u0010c\u001a\u00020&2\u0006\u0010d\u001a\u00020\u00062\u0006\u0010m\u001a\u00020l2\u0006\u0010e\u001a\u00020\u0006H\u0016¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\bH\u0016¢\u0006\u0004\bp\u0010\u0014J\u000f\u0010q\u001a\u00020\bH\u0016¢\u0006\u0004\bq\u0010\u0014J\u000f\u0010r\u001a\u00020\bH\u0016¢\u0006\u0004\br\u0010\u0014J\u000f\u0010s\u001a\u00020\bH\u0016¢\u0006\u0004\bs\u0010\u0014J\u000f\u0010t\u001a\u00020\bH\u0016¢\u0006\u0004\bt\u0010\u0014J\u001f\u0010w\u001a\u00020\b2\u0006\u0010u\u001a\u00020&2\u0006\u0010v\u001a\u00020&H\u0016¢\u0006\u0004\bw\u0010^J\u000f\u0010x\u001a\u00020\bH\u0016¢\u0006\u0004\bx\u0010\u0014J\u0017\u0010y\u001a\u00020\b2\u0006\u0010\r\u001a\u00020&H\u0016¢\u0006\u0004\by\u0010(J\u0017\u0010z\u001a\u00020\b2\u0006\u0010\r\u001a\u00020&H\u0016¢\u0006\u0004\bz\u0010(J\u000f\u0010{\u001a\u00020\bH\u0016¢\u0006\u0004\b{\u0010\u0014J\u0017\u0010}\u001a\u00020\b2\u0006\u0010|\u001a\u00020&H\u0016¢\u0006\u0004\b}\u0010(J\u0017\u0010\u007f\u001a\u00020\b2\u0006\u0010~\u001a\u00020&H\u0016¢\u0006\u0004\b\u007f\u0010(J\u0019\u0010\u0080\u0001\u001a\u00020\b2\u0006\u0010~\u001a\u00020&H\u0016¢\u0006\u0005\b\u0080\u0001\u0010(J\u001a\u0010\u0082\u0001\u001a\u00020\b2\u0007\u0010\u0081\u0001\u001a\u00020\u0006H\u0016¢\u0006\u0005\b\u0082\u0001\u0010\nJ#\u0010\u0085\u0001\u001a\u00020\b2\u0007\u0010\u0083\u0001\u001a\u00020\u00062\u0007\u0010\u0084\u0001\u001a\u00020\u0006H\u0016¢\u0006\u0005\b\u0085\u0001\u0010WJ\u0019\u0010\u0086\u0001\u001a\u00020\b2\u0006\u0010\r\u001a\u00020&H\u0016¢\u0006\u0005\b\u0086\u0001\u0010(J\u0011\u0010\u0087\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\b\u0087\u0001\u0010\u0014R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010\u0088\u0001¨\u0006\u0089\u0001"}, d2 = {"Lb24/b;", "Lyw/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "stringId", "Lmx/a;", "S0", "(I)Lmx/a;", "", "", "arg", "T0", "(I[Ljava/lang/Object;)Lmx/a;", "quantity", "U0", "(III)Lmx/a;", "l", "()Lmx/a;", "a0", "v", "M0", "b", "O0", "Z", "j0", "z0", "r0", "m", "C", "a", "Q", "G", "c0", "q", "g0", "", "n", "(Ljava/lang/String;)Lmx/a;", "R", "f", "M", "c", "A0", "f0", "Q0", "I0", "i0", "C0", "d", "o0", "t", "l0", "G0", "w0", "k0", "K", "s", i.f37086m, "N0", "m0", "B", "n0", "j", "H0", ip.a.f96138c, "F", "J0", "O", "X", "e0", "u", "q0", "t0", "J", "o", "h0", "N", "F0", "E", "P0", "W", "K0", "v0", "u0", "(II)Lmx/a;", "y", "d0", "D0", "currentTime", "totalTime", i.f37094u, "(Ljava/lang/String;Ljava/lang/String;)Lmx/a;", i.f37087n, "T", "p", "R0", "title", "position", "listSize", "V", "(Ljava/lang/String;II)Lmx/a;", "p0", "h", "I", "U", "", "isSelected", "x0", "(Ljava/lang/String;IZI)Lmx/a;", "L0", "z", "x", "E0", "A", "start", "end", "b0", "e", "B0", "Y", "k", "extensions", "r", "size", ip.a.f96137b, "i", "limit", "w", "width", "height", "s0", "y0", "g", "Lmx/c;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements yw.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label S0(int stringId) {
        return this.labelProvider.c(stringId);
    }

    private final Label T0(int stringId, Object... arg) {
        return this.labelProvider.e(stringId, Arrays.copyOf(arg, arg.length));
    }

    private final Label U0(int stringId, int quantity, int arg) {
        return this.labelProvider.a(stringId, quantity, String.valueOf(arg));
    }

    @Override // yw.a
    public Label A() {
        return S0(s04.b.Q0);
    }

    @Override // yw.a
    public Label A0() {
        return S0(s04.b.L);
    }

    @Override // yw.a
    public Label B() {
        return S0(s04.b.f177202f);
    }

    @Override // yw.a
    public Label B0(String arg) {
        return T0(s04.b.f177200e0, arg);
    }

    @Override // yw.a
    public Label C() {
        return S0(s04.b.f177205g);
    }

    @Override // yw.a
    public Label C0() {
        return S0(s04.b.W);
    }

    @Override // yw.a
    public Label D() {
        return S0(s04.b.f177187b);
    }

    @Override // yw.a
    public Label D0() {
        return S0(s04.b.H);
    }

    @Override // yw.a
    public Label E() {
        return S0(s04.b.Y);
    }

    @Override // yw.a
    public Label E0() {
        return S0(s04.b.P0);
    }

    @Override // yw.a
    public Label F() {
        return S0(s04.b.f177211i);
    }

    @Override // yw.a
    public Label F0() {
        return S0(s04.b.M);
    }

    @Override // yw.a
    public Label G() {
        return S0(s04.b.f177263z0);
    }

    @Override // yw.a
    public Label G0() {
        return S0(s04.b.f177229o);
    }

    @Override // yw.a
    public Label H(int quantity, int arg) {
        return U0(s04.a.f177182d, quantity, arg);
    }

    @Override // yw.a
    public Label H0() {
        return S0(s04.b.f177191c);
    }

    @Override // yw.a
    public Label I() {
        return S0(s04.b.K);
    }

    @Override // yw.a
    public Label I0() {
        return S0(s04.b.f177250v);
    }

    @Override // yw.a
    public Label J() {
        return S0(s04.b.V);
    }

    @Override // yw.a
    public Label J0() {
        return S0(s04.b.f177226n);
    }

    @Override // yw.a
    public Label K() {
        return S0(s04.b.f177217k);
    }

    @Override // yw.a
    public Label K0() {
        return S0(s04.b.P);
    }

    @Override // yw.a
    public Label L(String currentTime, String totalTime) {
        return this.labelProvider.e(s04.b.I, currentTime, totalTime);
    }

    @Override // yw.a
    public Label L0() {
        return S0(s04.b.L0);
    }

    @Override // yw.a
    public Label M() {
        return S0(s04.b.f177262z);
    }

    @Override // yw.a
    public Label M0() {
        return S0(s04.b.f177206g0);
    }

    @Override // yw.a
    public Label N() {
        return S0(s04.b.B);
    }

    @Override // yw.a
    public Label N0() {
        return S0(s04.b.f177215j0);
    }

    @Override // yw.a
    public Label O() {
        return S0(s04.b.f177186a2);
    }

    @Override // yw.a
    public Label O0() {
        return S0(s04.b.S);
    }

    @Override // yw.a
    public Label P() {
        return S0(s04.b.Y1);
    }

    @Override // yw.a
    public Label P0() {
        return S0(s04.b.A);
    }

    @Override // yw.a
    public Label Q() {
        return S0(s04.b.A0);
    }

    @Override // yw.a
    public Label Q0() {
        return S0(s04.b.O0);
    }

    @Override // yw.a
    public Label R() {
        return S0(s04.b.f177209h0);
    }

    @Override // yw.a
    public Label R0(int quantity) {
        return U0(s04.a.f177179a, quantity, quantity);
    }

    @Override // yw.a
    public Label S(String size) {
        return T0(s04.b.f177248u0, size);
    }

    @Override // yw.a
    public Label T(int quantity, int arg) {
        return U0(s04.a.f177181c, quantity, arg);
    }

    @Override // yw.a
    public Label U() {
        return S0(s04.b.J);
    }

    @Override // yw.a
    public Label V(String title, int position, int listSize) {
        return this.labelProvider.e(s04.b.Z, title, Integer.valueOf(position), Integer.valueOf(listSize));
    }

    @Override // yw.a
    public Label W() {
        return S0(s04.b.O);
    }

    @Override // yw.a
    public Label X() {
        return S0(s04.b.Z1);
    }

    @Override // yw.a
    public Label Y(String arg) {
        return T0(s04.b.f177196d0, arg);
    }

    @Override // yw.a
    public Label Z() {
        return S0(s04.b.T);
    }

    @Override // yw.a
    public Label a() {
        return S0(s04.b.B0);
    }

    @Override // yw.a
    public Label a0() {
        return S0(s04.b.W1);
    }

    @Override // yw.a
    public Label b() {
        return S0(s04.b.f177203f0);
    }

    @Override // yw.a
    public Label b0(String start, String end) {
        return T0(s04.b.f177235q, start, end);
    }

    @Override // yw.a
    public Label c() {
        return S0(s04.b.f177253w);
    }

    @Override // yw.a
    public Label c0() {
        return S0(s04.b.f177227n0);
    }

    @Override // yw.a
    public Label d() {
        return S0(s04.b.N);
    }

    @Override // yw.a
    public Label d0() {
        return S0(s04.b.F);
    }

    @Override // yw.a
    public Label e() {
        return S0(s04.b.f177238r);
    }

    @Override // yw.a
    public Label e0(String arg) {
        return T0(s04.b.f177199e, arg);
    }

    @Override // yw.a
    public Label f() {
        return S0(s04.b.f177208h);
    }

    @Override // yw.a
    public Label f0() {
        return S0(s04.b.J0);
    }

    @Override // yw.a
    public Label g() {
        return S0(s04.b.E0);
    }

    @Override // yw.a
    public Label g0() {
        return S0(s04.b.K0);
    }

    @Override // yw.a
    public Label h() {
        return S0(s04.b.f177188b0);
    }

    @Override // yw.a
    public Label h0() {
        return S0(s04.b.X);
    }

    @Override // yw.a
    public Label i(String size) {
        return T0(s04.b.f177245t0, size);
    }

    @Override // yw.a
    public Label i0() {
        return S0(s04.b.f177241s);
    }

    @Override // yw.a
    public Label j() {
        return S0(s04.b.f177183a);
    }

    @Override // yw.a
    public Label j0() {
        return S0(s04.b.U0);
    }

    @Override // yw.a
    public Label k() {
        return S0(s04.b.D);
    }

    @Override // yw.a
    public Label k0() {
        return S0(s04.b.f177211i);
    }

    @Override // yw.a
    public Label l() {
        return S0(s04.b.U1);
    }

    @Override // yw.a
    public Label l0() {
        return S0(s04.b.f177218k0);
    }

    @Override // yw.a
    public Label m() {
        return S0(s04.b.f177190b2);
    }

    @Override // yw.a
    public Label m0() {
        return S0(s04.b.f177247u);
    }

    @Override // yw.a
    public Label n(String arg) {
        return T0(s04.b.f177194c2, arg);
    }

    @Override // yw.a
    public Label n0() {
        return S0(s04.b.f177212i0);
    }

    @Override // yw.a
    public Label o() {
        return S0(s04.b.E);
    }

    @Override // yw.a
    public Label o0() {
        return S0(s04.b.f177259y);
    }

    @Override // yw.a
    public Label p() {
        return S0(s04.b.U);
    }

    @Override // yw.a
    public Label p0() {
        return S0(s04.b.f177184a0);
    }

    @Override // yw.a
    public Label q() {
        return S0(s04.b.G0);
    }

    @Override // yw.a
    public Label q0() {
        return S0(s04.b.f177256x);
    }

    @Override // yw.a
    public Label r(String extensions) {
        return T0(s04.b.f177242s0, extensions);
    }

    @Override // yw.a
    public Label r0() {
        return S0(s04.b.f177233p0);
    }

    @Override // yw.a
    public Label s() {
        return S0(s04.b.f177214j);
    }

    @Override // yw.a
    public Label s0(int width, int height) {
        return T0(s04.b.f177251v0, Integer.valueOf(width), Integer.valueOf(height));
    }

    @Override // yw.a
    public Label t() {
        return S0(s04.b.C);
    }

    @Override // yw.a
    public Label t0() {
        return S0(s04.b.R);
    }

    @Override // yw.a
    public Label u() {
        return S0(s04.b.f177244t);
    }

    @Override // yw.a
    public Label u0(int quantity, int arg) {
        return U0(s04.a.f177180b, quantity, arg);
    }

    @Override // yw.a
    public Label v() {
        return S0(s04.b.V1);
    }

    @Override // yw.a
    public Label v0() {
        return S0(s04.b.Q);
    }

    @Override // yw.a
    public Label w(int limit) {
        return T0(s04.b.f177254w0, Integer.valueOf(limit));
    }

    @Override // yw.a
    public Label w0() {
        return S0(s04.b.f177192c0);
    }

    @Override // yw.a
    public Label x() {
        return S0(s04.b.f177230o0);
    }

    @Override // yw.a
    public Label x0(String title, int position, boolean isSelected, int listSize) {
        int i15;
        mx.c cVar = this.labelProvider;
        if (isSelected) {
            i15 = s04.b.f177223m;
        } else {
            if (isSelected) {
                throw new p();
            }
            i15 = s04.b.f177220l;
        }
        return cVar.e(i15, title, Integer.valueOf(position), Integer.valueOf(listSize));
    }

    @Override // yw.a
    public Label y() {
        return S0(s04.b.G);
    }

    @Override // yw.a
    public Label y0(String arg) {
        return T0(s04.b.f177195d, arg);
    }

    @Override // yw.a
    public Label z() {
        return S0(s04.b.R0);
    }

    @Override // yw.a
    public Label z0() {
        return S0(s04.b.T0);
    }
}
