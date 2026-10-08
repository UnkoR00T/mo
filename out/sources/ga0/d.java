package ga0;

import da0.AvailableDocument;
import er.l;
import fr.t;
import h30.ButtonData;
import ha0.e;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lga0/d;", "Lxw/f;", "Lga0/d$a;", "Lha0/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "", "Lda0/a;", "availableDocuments", "Lha0/f$a$b;", "e", "(Lga0/d$a;Ljava/util/List;)Lha0/f$a$b;", "h", "(Lga0/d$a;)Lha0/f$a;", "a", "Lmx/c;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, ha0.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ga0.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Lga0/d$a;", "", "Lha0/e;", "state", "Lkotlin/Function1;", "Lda0/a;", "Loq/i0;", "onCheck", "Lkotlin/Function0;", "onAddAction", "onBackAction", "<init>", "(Lha0/e;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lha0/e;", "d", "()Lha0/e;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "()Ler/a;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<AvailableDocument, i0> onCheck;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(e eVar, l<? super AvailableDocument, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = eVar;
            this.onCheck = lVar;
            this.onAddAction = aVar;
            this.onBackAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onAddAction;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final l<AvailableDocument, i0> c() {
            return this.onCheck;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final e getState() {
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
            return t.c(this.state, params.state) && t.c(this.onCheck, params.onCheck) && t.c(this.onAddAction, params.onAddAction) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onCheck.hashCode()) * 31) + this.onAddAction.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCheck=" + this.onCheck + ", onAddAction=" + this.onAddAction + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71527a;

        static {
            int[] iArr = new int[vf0.d.values().length];
            try {
                iArr[vf0.d.SCHOOL_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vf0.d.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vf0.d.FAMILY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vf0.d.UUT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f71527a = iArr;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final ha0.f.a.Initialized e(final Params params, List<AvailableDocument> availableDocuments) {
        int i15;
        int i16;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new i.Large(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(z90.a.f233630b), null, null, null, 28, null), null, null, null, null, 60, null);
        Label labelC = this.labelProvider.c(z90.a.f233629a);
        ArrayList arrayList = new ArrayList();
        int i17 = 0;
        for (Object obj : availableDocuments) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                v.x();
            }
            final AvailableDocument availableDocument = (AvailableDocument) obj;
            n50.d.CheckBox checkBox = new n50.d.CheckBox(availableDocument.getIsCheck());
            vf0.d documentType = availableDocument.getDocumentType();
            int[] iArr = b.f71527a;
            int i19 = iArr[documentType.ordinal()];
            if (i19 == 1) {
                i15 = jz.a.P2;
            } else if (i19 == 2) {
                i15 = jz.a.M2;
            } else if (i19 == 3) {
                i15 = jz.a.O2;
            } else if (i19 == 4) {
                i15 = jz.a.T2;
            } else {
                if (i19 != 5) {
                    throw new p();
                }
                i15 = jz.a.f106731a3;
            }
            LeadingSection leadingSection = new LeadingSection(false, checkBox, new n50.i.Resource(new n50.i.Resource.a.DrawableResource(i15, null, 2, null), null, null, 6, null), 1, null);
            mx.c cVar = this.labelProvider;
            int i25 = iArr[availableDocument.getDocumentType().ordinal()];
            if (i25 == 1) {
                i16 = z90.a.f233636h;
            } else if (i25 == 2) {
                i16 = z90.a.f233634f;
            } else if (i25 == 3) {
                i16 = z90.a.f233635g;
            } else if (i25 == 4) {
                i16 = z90.a.f233637i;
            } else {
                if (i25 != 5) {
                    throw new p();
                }
                i16 = z90.a.f233633e;
            }
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: ga0.c
                @Override // er.a
                public final Object a() {
                    return d.f(params, availableDocument);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(cVar.c(i16), null, null, 0, 0, null, 62, null)), null, 5, null), leadingSection, null, null, 3325, null));
            i17 = i18;
        }
        i0 i0Var = i0.f148189a;
        return new ha0.f.a.Initialized(baseScaffoldData, labelC, arrayList, this.labelProvider.c(z90.a.f233632d), null, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(z90.a.f233631c), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, AvailableDocument availableDocument) {
        params.c().b(availableDocument);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ha0.f.a b(Params params) {
        e state = params.getState();
        if (state instanceof e.Initialized) {
            return e(params, ((e.Initialized) state).b());
        }
        if (state instanceof e.AddDocument) {
            return e(params, ((e.AddDocument) state).a());
        }
        if (state instanceof e.Error) {
            return new ha0.f.a.Error(((e.Error) params.getState()).getErrorVMS());
        }
        throw new p();
    }
}
