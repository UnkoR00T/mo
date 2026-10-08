package fw2;

import b30.AccordionData;
import b30.AccordionElement;
import dw2.State;
import fr.t;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lfw2/a;", "Lxw/f;", "Lfw2/a$a;", "Ldw2/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "", "Ldw2/f$a$a;", "e", "(Lfw2/a$a;)Ljava/util/List;", "Lkotlin/Function0;", "Loq/i0;", "onOpenAboutPhotoUrlAction", "onOpenIsDocumentReadyUrlAction", "h", "(Ler/a;Ler/a;)Ljava/util/List;", "c", "i", "f", "(Lfw2/a$a;)Ldw2/f$a;", "a", "Lmx/c;", "Lmx/a;", "b", "Lmx/a;", "lineSpacer", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, dw2.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label lineSpacer = mx.b.b("\n\n", "");

    /* JADX INFO: renamed from: fw2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lfw2/a$a;", "", "Ldw2/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onOpenAboutPhotoUrlAction", "onOpenIsDocumentReadyUrlAction", "<init>", "(Ldw2/e;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldw2/e;", "d", "()Ldw2/e;", "b", "Ler/a;", "()Ler/a;", "c", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenAboutPhotoUrlAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenIsDocumentReadyUrlAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onBackAction = aVar;
            this.onOpenAboutPhotoUrlAction = aVar2;
            this.onOpenIsDocumentReadyUrlAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onOpenAboutPhotoUrlAction;
        }

        public final er.a<i0> c() {
            return this.onOpenIsDocumentReadyUrlAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onOpenAboutPhotoUrlAction, params.onOpenAboutPhotoUrlAction) && t.c(this.onOpenIsDocumentReadyUrlAction, params.onOpenIsDocumentReadyUrlAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onOpenAboutPhotoUrlAction.hashCode()) * 31) + this.onOpenIsDocumentReadyUrlAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onOpenAboutPhotoUrlAction=" + this.onOpenAboutPhotoUrlAction + ", onOpenIsDocumentReadyUrlAction=" + this.onOpenIsDocumentReadyUrlAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68438a;

        static {
            int[] iArr = new int[lv2.a.values().length];
            try {
                iArr[lv2.a.MYSELF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lv2.a.CHILD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lv2.a.WARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f68438a = iArr;
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final List<dw2.f.Data.QuestionAnswerData> c(er.a<i0> onOpenAboutPhotoUrlAction, er.a<i0> onOpenIsDocumentReadyUrlAction) {
        return v.q(new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77237c1), this.labelProvider.c(gv2.a.f77272j1), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77316u1), this.labelProvider.c(gv2.a.f77284m1), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77320v1), this.labelProvider.c(gv2.a.f77288n1), new ButtonTextData(null, this.labelProvider.c(gv2.a.H), null, null, onOpenAboutPhotoUrlAction, 13, null)), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77247e1), this.labelProvider.c(gv2.a.f77292o1), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77252f1), this.labelProvider.c(gv2.a.W0), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77257g1), this.labelProvider.c(gv2.a.X0), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77262h1), this.labelProvider.c(gv2.a.Y0), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77267i1), this.labelProvider.c(gv2.a.Z0).o(this.lineSpacer).o(this.labelProvider.c(gv2.a.f77232b1)), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77332y1), this.labelProvider.c(gv2.a.f77227a1).o(this.lineSpacer).o(this.labelProvider.c(gv2.a.f77232b1)), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77308s1), this.labelProvider.c(gv2.a.f77276k1), new ButtonTextData(null, this.labelProvider.c(gv2.a.f77319v0), null, null, onOpenIsDocumentReadyUrlAction, 13, null)), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77312t1), this.labelProvider.c(gv2.a.f77280l1), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77242d1), this.labelProvider.c(gv2.a.V0), null, 4, null));
    }

    private final List<dw2.f.Data.QuestionAnswerData> e(Params params) {
        int i15 = b.f68438a[params.getState().getApplicationOwner().ordinal()];
        if (i15 == 1) {
            return h(params.b(), params.c());
        }
        if (i15 == 2) {
            return c(params.b(), params.c());
        }
        if (i15 == 3) {
            return i(params.b(), params.c());
        }
        throw new p();
    }

    private final List<dw2.f.Data.QuestionAnswerData> h(er.a<i0> onOpenAboutPhotoUrlAction, er.a<i0> onOpenIsDocumentReadyUrlAction) {
        return v.q(new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77304r1), this.labelProvider.c(gv2.a.f77272j1), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77316u1), this.labelProvider.c(gv2.a.f77284m1), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77320v1), this.labelProvider.c(gv2.a.f77288n1), new ButtonTextData(null, this.labelProvider.c(gv2.a.H), null, null, onOpenAboutPhotoUrlAction, 13, null)), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77324w1), this.labelProvider.c(gv2.a.f77292o1), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77328x1), this.labelProvider.c(gv2.a.f77296p1).o(this.lineSpacer).o(this.labelProvider.c(gv2.a.U0)), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77332y1), this.labelProvider.c(gv2.a.f77300q1).o(this.lineSpacer).o(this.labelProvider.c(gv2.a.U0)), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77308s1), this.labelProvider.c(gv2.a.f77276k1), new ButtonTextData(null, this.labelProvider.c(gv2.a.f77319v0), null, null, onOpenIsDocumentReadyUrlAction, 13, null)), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77312t1), this.labelProvider.c(gv2.a.f77280l1), null, 4, null));
    }

    private final List<dw2.f.Data.QuestionAnswerData> i(er.a<i0> onOpenAboutPhotoUrlAction, er.a<i0> onOpenIsDocumentReadyUrlAction) {
        return v.q(new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.F1), this.labelProvider.c(gv2.a.f77272j1), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77316u1), this.labelProvider.c(gv2.a.f77284m1), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77320v1), this.labelProvider.c(gv2.a.f77288n1), new ButtonTextData(null, this.labelProvider.c(gv2.a.H), null, null, onOpenAboutPhotoUrlAction, 13, null)), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77247e1), this.labelProvider.c(gv2.a.f77292o1), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.H1), this.labelProvider.c(gv2.a.A1), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.I1), this.labelProvider.c(gv2.a.B1), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.J1), this.labelProvider.c(gv2.a.C1).o(this.lineSpacer).o(this.labelProvider.c(gv2.a.E1)), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77332y1), this.labelProvider.c(gv2.a.D1).o(this.lineSpacer).o(this.labelProvider.c(gv2.a.E1)), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77308s1), this.labelProvider.c(gv2.a.f77276k1), new ButtonTextData(null, this.labelProvider.c(gv2.a.f77319v0), null, null, onOpenIsDocumentReadyUrlAction, 13, null)), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.f77312t1), this.labelProvider.c(gv2.a.f77280l1), null, 4, null), new dw2.f.Data.QuestionAnswerData(this.labelProvider.c(gv2.a.G1), this.labelProvider.c(gv2.a.f77336z1), null, 4, null));
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public dw2.f.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(gv2.a.K), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        List<dw2.f.Data.QuestionAnswerData> listE = e(params);
        List<dw2.f.Data.QuestionAnswerData> listE2 = e(params);
        ArrayList arrayList = new ArrayList(v.y(listE2, 10));
        for (dw2.f.Data.QuestionAnswerData questionAnswerData : listE2) {
            arrayList.add(new AccordionElement(null, questionAnswerData.getQuestion(), null, false, null, false, new ew2.b(questionAnswerData.getAnswer(), questionAnswerData.getButtonData()), 61, null));
        }
        return new dw2.f.Data(baseScaffoldData, aVarA, listE, new AccordionData(arrayList));
    }
}
