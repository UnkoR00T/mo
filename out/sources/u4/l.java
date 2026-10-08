package u4;

import p071kotlin.Metadata;
import p076m2.f6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0002\f\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lu4/l;", "", "", "canLoadSynchronously", "<init>", "(Z)V", "a", "Z", "getCanLoadSynchronously", "()Z", "getCanLoadSynchronously$annotations", "()V", "b", "Lu4/j;", "Lu4/i0;", "Lu4/t0;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t0 f195261c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h0 f195262d = new h0("sans-serif", "FontFamily.SansSerif");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h0 f195263e = new h0("serif", "FontFamily.Serif");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h0 f195264f = new h0("monospace", "FontFamily.Monospace");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final h0 f195265g = new h0("cursive", "FontFamily.Cursive");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean canLoadSynchronously;

    /* JADX INFO: renamed from: u4.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu4/l$a;", "", "<init>", "()V", "Lu4/t0;", "Default", "Lu4/t0;", "a", "()Lu4/t0;", "Lu4/h0;", "SansSerif", "Lu4/h0;", "b", "()Lu4/h0;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final t0 a() {
            return l.f195261c;
        }

        public final h0 b() {
            return l.f195262d;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0001\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lu4/l$b;", "", "Lu4/l;", "fontFamily", "Lu4/d0;", "fontWeight", "Lu4/y;", "fontStyle", "Lu4/z;", "fontSynthesis", "Lm2/f6;", "a", "(Lu4/l;Lu4/d0;II)Lm2/f6;", "Lu4/p;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        static /* synthetic */ f6 b(b bVar, l lVar, FontWeight fontWeight, int i15, int i16, int i17, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i17 & 1) != 0) {
                lVar = null;
            }
            if ((i17 & 2) != 0) {
                fontWeight = FontWeight.INSTANCE.d();
            }
            if ((i17 & 4) != 0) {
                i15 = y.INSTANCE.b();
            }
            if ((i17 & 8) != 0) {
                i16 = z.INSTANCE.a();
            }
            return bVar.a(lVar, fontWeight, i15, i16);
        }

        f6<Object> a(l fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis);
    }

    public /* synthetic */ l(boolean z15, fr.k kVar) {
        this(z15);
    }

    private l(boolean z15) {
        this.canLoadSynchronously = z15;
    }
}
