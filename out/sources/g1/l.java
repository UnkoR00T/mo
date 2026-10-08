package g1;

import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p056h1.o2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 22\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJy\u0010\u0014\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00042\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lg1/l;", "Lg1/t0;", "Lh1/z;", "Lg1/j;", "Lkotlin/Function1;", "Loq/i0;", "content", "<init>", "(Ler/l;)V", "", "count", "", "key", "Lkotlin/Function2;", "Lg1/x;", "Lg1/c;", "span", CMSAttributeTableGenerator.CONTENT_TYPE, "Lg1/v;", "itemContent", "g", "(ILer/l;Ler/p;Ler/l;Ler/r;)V", "Lg1/z0;", "a", "Lg1/z0;", "t", "()Lg1/z0;", "spanLayoutProvider", "Lh1/o2;", "b", "Lh1/o2;", "s", "()Lh1/o2;", "intervals", "", "c", "Z", "q", "()Z", "setHasCustomSpans$foundation", "(Z)V", "hasCustomSpans", "Lr0/i0;", "d", "Lr0/i0;", "_headerIndexes", "Lr0/o;", "r", "()Lr0/o;", "headerIndexes", "e", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends p056h1.z<j> implements t0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f69374e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f69375f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final er.p<x, Integer, c> f69376g = new er.p() { // from class: g1.k
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return l.p((x) obj, ((Integer) obj2).intValue());
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z0 spanLayoutProvider = new z0(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o2<j> intervals = new o2<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasCustomSpans;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private r0.i0 _headerIndexes;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg1/l$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public l(er.l<? super t0, oq.i0> lVar) {
        lVar.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c p(x xVar, int i15) {
        return c.a(x0.a(1));
    }

    @Override // g1.t0
    public void g(int count, er.l<? super Integer, ? extends Object> key, er.p<? super x, ? super Integer, c> span, er.l<? super Integer, ? extends Object> contentType, er.r<? super v, ? super Integer, ? super p076m2.r, ? super Integer, oq.i0> itemContent) {
        l().b(count, new j(key, span == null ? f69376g : span, contentType, itemContent));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    public final r0.o r() {
        r0.i0 i0Var = this._headerIndexes;
        return i0Var != null ? i0Var : r0.p.a();
    }

    @Override // p056h1.z
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public o2<j> l() {
        return this.intervals;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final z0 getSpanLayoutProvider() {
        return this.spanLayoutProvider;
    }
}
