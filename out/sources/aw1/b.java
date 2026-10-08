package aw1;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import fv0.BEDiploma;
import fv0.BEDiplomasByLanguage;
import h30.ButtonData;
import i30.ButtonIconData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.d;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.w0;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import zv1.e;
import zv1.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Law1/b;", "Lxw/f;", "Law1/b$a;", "Lzv1/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lfv0/a$a;", "Ln50/w0;", "m", "(Lfv0/a$a;)Ln50/w0;", "Lfv0/d$a;", "Lmx/a;", "i", "(Lfv0/d$a;)Lmx/a;", "Lfv0/b;", "l", "(Lfv0/b;)Lmx/a;", "", "stringId", "h", "(I)Lmx/a;", "params", "e", "(Law1/b$a;)Lzv1/g$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: aw1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Law1/b$a;", "", "Lzv1/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Lfv0/a;", "onDownload", "<init>", "(Lzv1/e;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzv1/e;", "c", "()Lzv1/e;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<BEDiploma, i0> onDownload;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(e eVar, er.a<i0> aVar, l<? super BEDiploma, i0> lVar) {
            this.state = eVar;
            this.onBack = aVar;
            this.onDownload = lVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<BEDiploma, i0> b() {
            return this.onDownload;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onDownload, params.onDownload);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onDownload.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onDownload=" + this.onDownload + ')';
        }
    }

    /* JADX INFO: renamed from: aw1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0328b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f14776c;

        static {
            int[] iArr = new int[BEDiploma.EnumC1516a.values().length];
            try {
                iArr[BEDiploma.EnumC1516a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BEDiploma.EnumC1516a.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BEDiploma.EnumC1516a.IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BEDiploma.EnumC1516a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14774a = iArr;
            int[] iArr2 = new int[BEDiplomasByLanguage.a.values().length];
            try {
                iArr2[BEDiplomasByLanguage.a.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BEDiplomasByLanguage.a.EN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BEDiplomasByLanguage.a.DE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BEDiplomasByLanguage.a.FR.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BEDiplomasByLanguage.a.ES.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BEDiplomasByLanguage.a.RU.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BEDiplomasByLanguage.a.LA.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            f14775b = iArr2;
            int[] iArr3 = new int[fv0.b.values().length];
            try {
                iArr3[fv0.b.ORIGINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[fv0.b.COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[fv0.b.SUPPLEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[fv0.b.SUPPLEMENT_COPY.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            f14776c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f14777a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1596874444);
            if (p076m2.t.k()) {
                p076m2.t.o(1596874444, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.electronicdiploma.diplomapdflist.mapper.DiplomaPdfListScreenMapper.invoke.<anonymous>.<anonymous>.<anonymous> (DiplomaPdfListScreenMapper.kt:121)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, BEDiploma bEDiploma) {
        params.b().b(bEDiploma);
        return i0.f148189a;
    }

    private final Label h(int stringId) {
        return this.labelProvider.c(stringId);
    }

    private final Label i(BEDiplomasByLanguage.a aVar) {
        switch (C0328b.f14775b[aVar.ordinal()]) {
            case 1:
                return h(dv1.a.f44653p);
            case 2:
                return h(dv1.a.f44645l);
            case 3:
                return h(dv1.a.f44643k);
            case 4:
                return h(dv1.a.f44649n);
            case 5:
                return h(dv1.a.f44647m);
            case 6:
                return h(dv1.a.f44655q);
            case 7:
                return h(dv1.a.f44651o);
            default:
                throw new oq.p();
        }
    }

    private final Label l(fv0.b bVar) {
        int i15 = C0328b.f14776c[bVar.ordinal()];
        if (i15 == 1) {
            return h(dv1.a.f44624a0);
        }
        if (i15 == 2) {
            return h(dv1.a.Z);
        }
        if (i15 == 3) {
            return h(dv1.a.f44626b0);
        }
        if (i15 == 4) {
            return h(dv1.a.f44628c0);
        }
        throw new oq.p();
    }

    private final w0 m(BEDiploma.EnumC1516a enumC1516a) {
        Label labelH;
        r50.g gVar;
        int[] iArr = C0328b.f14774a;
        int i15 = iArr[enumC1516a.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                labelH = h(dv1.a.Y);
            } else if (i15 == 3) {
                labelH = h(dv1.a.X);
            } else {
                if (i15 != 4) {
                    throw new oq.p();
                }
                labelH = h(dv1.a.W);
            }
            Label label = labelH;
            int i16 = iArr[enumC1516a.ordinal()];
            if (i16 != 1) {
                if (i16 == 2) {
                    gVar = r50.g.POSITIVE;
                } else if (i16 == 3) {
                    gVar = r50.g.INFORMATIVE;
                } else {
                    if (i16 != 4) {
                        throw new oq.p();
                    }
                    gVar = r50.g.NEGATIVE;
                }
                return new w0.StatusBadge(new r50.a.WithIcon(null, label, null, 0, false, gVar, 29, null));
            }
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g.a b(final Params params) {
        er.a aVar;
        x0 x0VarB;
        b bVar = this;
        e state = params.getState();
        if (t.c(state, e.c.f237923a)) {
            return new g.a.Empty(params.a());
        }
        if (state instanceof e.LoadingError) {
            return new g.a.Error(params.a(), ((e.LoadingError) state).getErrorVMSAdapter());
        }
        e.b.PermissionDialog permissionDialog = null;
        if (t.c(state, e.a.f237917a)) {
            return new g.a.DiplomaDocumentInvalid(params.a(), new IconPageData(j.b.a.f164684d, bVar.h(dv1.a.U), bVar.h(dv1.a.T), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(bVar.h(dv1.a.f44657r), null, 2, null), d.a.f107773a, null, params.a(), 35, null), null, null, 6, null), false, 72, null));
        }
        if (!(state instanceof e.b)) {
            throw new oq.p();
        }
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), bVar.h(dv1.a.Q), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelH = bVar.h(dv1.a.S);
        Label labelH2 = bVar.h(dv1.a.R);
        c30.b.c cVar = new c30.b.c("InfoAlert", null, null, bVar.h(dv1.a.P), null, null, null, 118, null);
        List<BEDiplomasByLanguage> listB = ((e.b) state).getStateContent().b();
        int i15 = 10;
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator it = listB.iterator();
        int i16 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i17 = i16 + 1;
            if (i16 < 0) {
                v.x();
            }
            BEDiplomasByLanguage bEDiplomasByLanguage = (BEDiplomasByLanguage) next;
            Label labelI = bVar.i(bEDiplomasByLanguage.getLanguageCode());
            List<BEDiploma> listA = bEDiplomasByLanguage.a();
            ArrayList arrayList2 = new ArrayList(v.y(listA, i15));
            Iterator it4 = listA.iterator();
            int i18 = 0;
            while (it4.hasNext()) {
                Object next2 = it4.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    v.x();
                }
                final BEDiploma bEDiploma = (BEDiploma) next2;
                Label labelL = bVar.l(bEDiploma.getDiplomaSubtype());
                Iterator it5 = it;
                Iterator it6 = it4;
                er.a<i0> aVar2 = aVarA;
                BaseScaffoldData baseScaffoldData2 = baseScaffoldData;
                Label labelE = bVar.labelProvider.e(dv1.a.C, labelL.getText(), labelI.getText());
                int i25 = C0328b.f14774a[bEDiploma.getGenerationStatus().ordinal()];
                boolean z15 = i25 == 1 || i25 == 2;
                er.a aVar3 = new er.a() { // from class: aw1.a
                    @Override // er.a
                    public final Object a() {
                        return b.f(params, bEDiploma);
                    }
                };
                String str = "DiplomaCard" + i16 + '_' + i18;
                w0 w0VarM = bVar.m(bEDiploma.getGenerationStatus());
                BodySection bodySection = new BodySection(null, new n50.b.Title(n50.l.b(labelL, null, null, 3, null)), null, 5, null);
                if (z15) {
                    aVar = aVar3;
                    x0VarB = new x0.IconButton(new ButtonIconData(null, jz.a.f106751d, c.f14777a, null, labelE, aVar, 9, null));
                } else {
                    aVar = aVar3;
                    if (z15) {
                        throw new oq.p();
                    }
                    x0VarB = x0.Icon.INSTANCE.b();
                }
                arrayList2.add(new DefaultSingleCardData(str, !z15 ? aVar : null, false, null, null, false, null, w0VarM, bodySection, null, x0VarB, null, 2684, null));
                bVar = this;
                it4 = it6;
                i18 = i19;
                it = it5;
                aVarA = aVar2;
                baseScaffoldData = baseScaffoldData2;
            }
            arrayList.add(new g.a.Initialized.Section(labelI, new CardListData(arrayList2, null, false, null, null, 30, null)));
            permissionDialog = null;
            i16 = i17;
            it = it;
            baseScaffoldData = baseScaffoldData;
            i15 = 10;
            bVar = this;
        }
        e.b.PermissionDialog permissionDialog2 = permissionDialog;
        er.a<i0> aVar4 = aVarA;
        BaseScaffoldData baseScaffoldData3 = baseScaffoldData;
        e.b.PermissionDialog permissionDialog3 = state instanceof e.b.PermissionDialog ? (e.b.PermissionDialog) state : permissionDialog2;
        return new g.a.Initialized(aVar4, baseScaffoldData3, labelH, labelH2, arrayList, cVar, permissionDialog3 != null ? permissionDialog3.getDialogVMS() : permissionDialog2);
    }
}
