package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \f2\u00020\u0001:\u0003\f\u0011\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H ¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Ld1/m0;", "", "<init>", "()V", "", "size", "itemCrossAxisSize", "Lc5/t;", "layoutDirection", "Le4/a2;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(IILc5/t;Le4/a2;I)I", "b", "(Le4/a2;)Ljava/lang/Integer;", "", "c", "()Z", "isRelative", "Ld1/m0$b;", "Ld1/m0$c;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d1.m0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ld1/m0$a;", "", "<init>", "()V", "Lf3/c$c;", "vertical", "Ld1/m0;", "b", "(Lf3/c$c;)Ld1/m0;", "Lf3/c$b;", "horizontal", "a", "(Lf3/c$b;)Ld1/m0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final m0 a(f3.c.b horizontal) {
            return new HorizontalCrossAxisAlignment(horizontal);
        }

        public final m0 b(f3.c.InterfaceC1317c vertical) {
            return new VerticalCrossAxisAlignment(vertical);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: d1.m0$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ld1/m0$b;", "Ld1/m0;", "Lf3/c$b;", "horizontal", "<init>", "(Lf3/c$b;)V", "", "size", "itemCrossAxisSize", "Lc5/t;", "layoutDirection", "Le4/a2;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(IILc5/t;Le4/a2;I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lf3/c$b;", "getHorizontal", "()Lf3/c$b;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class HorizontalCrossAxisAlignment extends m0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final f3.c.b horizontal;

        public HorizontalCrossAxisAlignment(f3.c.b bVar) {
            super(null);
            this.horizontal = bVar;
        }

        @Override // d1.m0
        public int a(int size, int itemCrossAxisSize, c5.t layoutDirection, p036e4.a2 placeable, int beforeCrossAxisAlignmentLine) {
            return this.horizontal.a(itemCrossAxisSize, size, layoutDirection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HorizontalCrossAxisAlignment) && fr.t.c(this.horizontal, ((HorizontalCrossAxisAlignment) other).horizontal);
        }

        public int hashCode() {
            return this.horizontal.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.horizontal + ')';
        }
    }

    /* JADX INFO: renamed from: d1.m0$c, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ld1/m0$c;", "Ld1/m0;", "Lf3/c$c;", "vertical", "<init>", "(Lf3/c$c;)V", "", "size", "itemCrossAxisSize", "Lc5/t;", "layoutDirection", "Le4/a2;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(IILc5/t;Le4/a2;I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lf3/c$c;", "getVertical", "()Lf3/c$c;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class VerticalCrossAxisAlignment extends m0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final f3.c.InterfaceC1317c vertical;

        public VerticalCrossAxisAlignment(f3.c.InterfaceC1317c interfaceC1317c) {
            super(null);
            this.vertical = interfaceC1317c;
        }

        @Override // d1.m0
        public int a(int size, int itemCrossAxisSize, c5.t layoutDirection, p036e4.a2 placeable, int beforeCrossAxisAlignmentLine) {
            return this.vertical.a(itemCrossAxisSize, size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerticalCrossAxisAlignment) && fr.t.c(this.vertical, ((VerticalCrossAxisAlignment) other).vertical);
        }

        public int hashCode() {
            return this.vertical.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.vertical + ')';
        }
    }

    public /* synthetic */ m0(fr.k kVar) {
        this();
    }

    public abstract int a(int size, int itemCrossAxisSize, c5.t layoutDirection, p036e4.a2 placeable, int beforeCrossAxisAlignmentLine);

    public Integer b(p036e4.a2 placeable) {
        return null;
    }

    public boolean c() {
        return false;
    }

    private m0() {
    }
}
