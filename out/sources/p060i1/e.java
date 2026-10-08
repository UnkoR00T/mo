package p060i1;

import b3.b;
import b3.b0;
import b3.x;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.a;
import er.l;
import er.p;
import fr.k;
import java.util.List;
import lr.m;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Li1/e;", "Li1/i1;", "", "currentPage", "", "currentPageOffsetFraction", "Lkotlin/Function0;", "updatedPageCount", "<init>", "(IFLer/a;)V", "Lm2/a3;", i.f37086m, "Lm2/a3;", "H0", "()Lm2/a3;", "setPageCountState", "(Lm2/a3;)V", "pageCountState", "N", "()I", "pageCount", "Q", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e extends i1 {

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final x<e, ?> R = b.b(new p() { // from class: i1.b
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return e.D0((b0) obj, (e) obj2);
        }
    }, new l() { // from class: i1.c
        @Override // er.l
        public final Object b(Object obj) {
            return e.E0((List) obj);
        }
    });

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private a3<a<Integer>> pageCountState;

    /* JADX INFO: renamed from: i1.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li1/e$a;", "", "<init>", "()V", "Lb3/x;", "Li1/e;", "Saver", "Lb3/x;", "a", "()Lb3/x;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final x<e, ?> a() {
            return e.R;
        }

        private Companion() {
        }
    }

    public e(int i15, float f15, a<Integer> aVar) {
        super(i15, f15);
        this.pageCountState = c6.e(aVar, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List D0(b0 b0Var, e eVar) {
        return v.q(Integer.valueOf(eVar.A()), Float.valueOf(m.m(eVar.B(), -0.5f, 0.5f)), Integer.valueOf(eVar.N()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e E0(final List list) {
        return new e(((Integer) list.get(0)).intValue(), ((Float) list.get(1)).floatValue(), new a() { // from class: i1.d
            @Override // er.a
            public final Object a() {
                return Integer.valueOf(e.F0(list));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int F0(List list) {
        return ((Integer) list.get(2)).intValue();
    }

    public final a3<a<Integer>> H0() {
        return this.pageCountState;
    }

    @Override // p060i1.i1
    public int N() {
        return this.pageCountState.getValue().a().intValue();
    }
}
