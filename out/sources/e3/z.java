package e3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u001d¨\u0006)"}, d2 = {"Le3/z;", "", "", "data", "<init>", "(Ljava/lang/String;)V", "", "char", "Loq/i0;", "e", "(C)V", "message", "", "m", "(Ljava/lang/String;)Ljava/lang/Void;", "", "h", "(C)Z", "separator", "", "j", "(Ljava/lang/String;)I", "k", "(Ljava/lang/String;)Ljava/lang/String;", "l", "()Ljava/lang/String;", "i", "count", "a", "(I)V", "d", "()C", "c", "()Z", "Ljava/lang/String;", "f", "b", "I", "g", "()I", "setI", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int i;

    public z(String str) {
        this.data = str;
    }

    public static /* synthetic */ void b(z zVar, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = 1;
        }
        zVar.a(i15);
    }

    public final void a(int count) {
        this.i += count;
    }

    public final boolean c() {
        return this.i >= this.data.length();
    }

    public final char d() {
        return this.data.charAt(this.i);
    }

    public final void e(char c15) throws x {
        if (h(c15)) {
            return;
        }
        m("expected " + c15);
        throw new oq.g();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getI() {
        return this.i;
    }

    public final boolean h(char c15) {
        return this.i < this.data.length() && this.data.charAt(this.i) == c15;
    }

    public final void i(String separator) {
        while (this.i < this.data.length() && !fu.r.c0(separator, this.data.charAt(this.i), false, 2, null)) {
            this.i++;
        }
    }

    public final int j(String separator) throws x {
        Integer numU = fu.r.u(k(separator));
        if (numU != null) {
            return numU.intValue();
        }
        m("expected int");
        throw new oq.g();
    }

    public final String k(String separator) {
        int i15 = this.i;
        i(separator);
        int i16 = this.i;
        return i16 > i15 ? this.data.substring(i15, i16) : "";
    }

    public final String l() {
        String str = this.data;
        return str.substring(this.i, str.length());
    }

    public final Void m(String message) throws x {
        int iMin = Math.min(this.i, this.data.length());
        throw new x("Error while parsing source information: " + message + " at " + this.data.substring(0, iMin) + '|' + this.data.substring(iMin));
    }
}
