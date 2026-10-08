package o94;

import androidx.compose.ui.graphics.Color;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import er.p;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import j94.BehaviorSemesterDetails;
import j94.BehaviourGradeInfo;
import j94.FinalBehaviourGrade;
import j94.PartialBehaviourGrade;
import j94.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k40.EmptyStateData;
import m94.BehaviorListData;
import m94.SemesterSheetItemData;
import m94.e;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001AB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ%\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b$\u0010%J1\u0010,\u001a\u00020+2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00190)H\u0002¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u0004\u0018\u00010/*\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0018*\u00020.H\u0002¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u0004\u0018\u00010/*\u000205H\u0002¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\b\u0012\u0004\u0012\u0002020\u0018*\u000205H\u0002¢\u0006\u0004\b8\u00109J\u001b\u0010=\u001a\u00020<*\u0002052\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lo94/d;", "Lxw/f;", "Lo94/d$a;", "Lm94/e$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lm94/d$b;", "state", "params", "Lm94/e$a$a;", "s", "(Lm94/d$b;Lo94/d$a;)Lm94/e$a$a;", "Lm94/d$c;", "Lm94/e$a$b;", "x", "(Lm94/d$c;Lo94/d$a;)Lm94/e$a$b;", "Lm94/d$a;", "Lm94/e$a$c;", "z", "(Lm94/d$a;Lo94/d$a;)Lm94/e$a$c;", "Lkotlin/Function0;", "Loq/i0;", "onHide", "Li50/a;", "i", "(Ler/a;)Li50/a;", "onBack", "q", "Lj94/d;", "grade", "onShowFullBehaviourGradeText", "Ln50/g;", "h", "(Lj94/d;Ler/a;)Ln50/g;", "", "Lj94/f;", "grades", "Lkotlin/Function1;", "onGradeSelected", "Ln30/b;", "l", "(Ljava/util/List;Ler/l;)Ln30/b;", "Lj94/e;", "", "E", "(Lj94/e;)Ljava/lang/Integer;", "Landroidx/compose/ui/graphics/Color;", "G", "(Lj94/e;)Ler/p;", "Lj94/g;", "F", "(Lj94/g;)Ljava/lang/Integer;", i.f37087n, "(Lj94/g;)Ler/p;", "", "testTag", "Lmx/a;", "I", "(Lj94/g;Ljava/lang/String;)Lmx/a;", "r", "(Lo94/d$a;)Lm94/e$a;", "a", "Lmx/c;", "b", "Lez/e;", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: o94.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\"\u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b(\u0010!R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b$\u0010!R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b#\u0010'¨\u0006)"}, d2 = {"Lo94/d$a;", "", "Lm94/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onChangeSemester", "onDismissChangeSemester", "Lkotlin/Function1;", "", "onSemesterSelected", "onShowFullBehaviourGradeText", "onHideFullBehaviourGradeText", "Lj94/f;", "onGradeSelected", "<init>", "(Lm94/d;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm94/d;", "h", "()Lm94/d;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "Ler/l;", "f", "()Ler/l;", "g", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m94.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChangeSemester;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDismissChangeSemester;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onSemesterSelected;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onShowFullBehaviourGradeText;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onHideFullBehaviourGradeText;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<PartialBehaviourGrade, i0> onGradeSelected;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(m94.d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super String, i0> lVar, er.a<i0> aVar4, er.a<i0> aVar5, l<? super PartialBehaviourGrade, i0> lVar2) {
            this.state = dVar;
            this.onBack = aVar;
            this.onChangeSemester = aVar2;
            this.onDismissChangeSemester = aVar3;
            this.onSemesterSelected = lVar;
            this.onShowFullBehaviourGradeText = aVar4;
            this.onHideFullBehaviourGradeText = aVar5;
            this.onGradeSelected = lVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onChangeSemester;
        }

        public final er.a<i0> c() {
            return this.onDismissChangeSemester;
        }

        public final l<PartialBehaviourGrade, i0> d() {
            return this.onGradeSelected;
        }

        public final er.a<i0> e() {
            return this.onHideFullBehaviourGradeText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onChangeSemester, params.onChangeSemester) && t.c(this.onDismissChangeSemester, params.onDismissChangeSemester) && t.c(this.onSemesterSelected, params.onSemesterSelected) && t.c(this.onShowFullBehaviourGradeText, params.onShowFullBehaviourGradeText) && t.c(this.onHideFullBehaviourGradeText, params.onHideFullBehaviourGradeText) && t.c(this.onGradeSelected, params.onGradeSelected);
        }

        public final l<String, i0> f() {
            return this.onSemesterSelected;
        }

        public final er.a<i0> g() {
            return this.onShowFullBehaviourGradeText;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final m94.d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onChangeSemester.hashCode()) * 31) + this.onDismissChangeSemester.hashCode()) * 31) + this.onSemesterSelected.hashCode()) * 31) + this.onShowFullBehaviourGradeText.hashCode()) * 31) + this.onHideFullBehaviourGradeText.hashCode()) * 31) + this.onGradeSelected.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onChangeSemester=" + this.onChangeSemester + ", onDismissChangeSemester=" + this.onDismissChangeSemester + ", onSemesterSelected=" + this.onSemesterSelected + ", onShowFullBehaviourGradeText=" + this.onShowFullBehaviourGradeText + ", onHideFullBehaviourGradeText=" + this.onHideFullBehaviourGradeText + ", onGradeSelected=" + this.onGradeSelected + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f143591b;

        static {
            int[] iArr = new int[j94.e.values().length];
            try {
                iArr[j94.e.EXCELLENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j94.e.VERY_GOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j94.e.GOOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j94.e.SATISFACTORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j94.e.POOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[j94.e.UNSATISFACTORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[j94.e.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f143590a = iArr;
            int[] iArr2 = new int[g.values().length];
            try {
                iArr2[g.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[g.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[g.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f143591b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j94.e f143592a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f143593a;

            static {
                int[] iArr = new int[j94.e.values().length];
                try {
                    iArr[j94.e.EXCELLENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j94.e.VERY_GOOD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j94.e.GOOD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[j94.e.SATISFACTORY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[j94.e.POOR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[j94.e.UNSATISFACTORY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[j94.e.UNKNOWN.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f143593a = iArr;
            }
        }

        c(j94.e eVar) {
            this.f143592a = eVar;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            long jM20unboximpl;
            rVar.X(199072287);
            if (p076m2.t.k()) {
                p076m2.t.o(199072287, i15, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.mapper.BehaviorListMapper.toIconColor.<anonymous> (BehaviorListMapper.kt:285)");
            }
            l94.a aVar = (l94.a) rVar.N(l94.c.c());
            switch (a.f143593a[this.f143592a.ordinal()]) {
                case 1:
                    rVar.X(-1965056332);
                    jM20unboximpl = aVar.b().B(rVar, 0).m20unboximpl();
                    rVar.R();
                    break;
                case 2:
                    rVar.X(-1965053901);
                    jM20unboximpl = aVar.d().B(rVar, 0).m20unboximpl();
                    rVar.R();
                    break;
                case 3:
                    rVar.X(-1965051665);
                    jM20unboximpl = aVar.c().B(rVar, 0).m20unboximpl();
                    rVar.R();
                    break;
                case 4:
                    rVar.X(-1965049289);
                    jM20unboximpl = aVar.a().B(rVar, 0).m20unboximpl();
                    rVar.R();
                    break;
                case 5:
                    rVar.X(-1965046929);
                    jM20unboximpl = aVar.f().B(rVar, 0).m20unboximpl();
                    rVar.R();
                    break;
                case 6:
                    rVar.X(-1965044487);
                    jM20unboximpl = aVar.e().B(rVar, 0).m20unboximpl();
                    rVar.R();
                    break;
                case 7:
                    rVar.X(-1965041431);
                    jM20unboximpl = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                    rVar.R();
                    break;
                default:
                    rVar.X(-1965057979);
                    rVar.R();
                    throw new oq.p();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jM20unboximpl;
        }
    }

    /* JADX INFO: renamed from: o94.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3566d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f143594a;

        /* JADX INFO: renamed from: o94.d$d$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f143595a;

            static {
                int[] iArr = new int[g.values().length];
                try {
                    iArr[g.POSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g.NEGATIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f143595a = iArr;
            }
        }

        C3566d(g gVar) {
            this.f143594a = gVar;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            long jD;
            rVar.X(848433581);
            if (p076m2.t.k()) {
                p076m2.t.o(848433581, i15, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.mapper.BehaviorListMapper.toIconColor.<anonymous> (BehaviorListMapper.kt:304)");
            }
            int i16 = a.f143595a[this.f143594a.ordinal()];
            if (i16 == 1) {
                rVar.X(-699112069);
                jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
                rVar.R();
            } else if (i16 == 2) {
                rVar.X(-699109415);
                jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                rVar.R();
            } else {
                if (i16 != 3) {
                    rVar.X(-699114446);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-699106857);
                jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jD;
        }
    }

    public d(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Integer E(j94.e eVar) {
        switch (b.f143590a[eVar.ordinal()]) {
            case 1:
                return Integer.valueOf(jz.a.f106861s0);
            case 2:
                return Integer.valueOf(jz.a.f106868t0);
            case 3:
                return Integer.valueOf(jz.a.f106868t0);
            case 4:
                return Integer.valueOf(jz.a.f106889w0);
            case 5:
                return Integer.valueOf(jz.a.f106875u0);
            case 6:
                return Integer.valueOf(jz.a.f106882v0);
            case 7:
                return null;
            default:
                throw new oq.p();
        }
    }

    private final Integer F(g gVar) {
        int i15 = b.f143591b[gVar.ordinal()];
        if (i15 == 1) {
            return Integer.valueOf(jz.a.f106761e1);
        }
        if (i15 == 2) {
            return Integer.valueOf(jz.a.f106769f1);
        }
        if (i15 == 3) {
            return null;
        }
        throw new oq.p();
    }

    private final p<r, Integer, Color> G(j94.e eVar) {
        return new c(eVar);
    }

    private final p<r, Integer, Color> H(g gVar) {
        return new C3566d(gVar);
    }

    private final Label I(g gVar, String str) {
        int i15 = b.f143591b[gVar.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(f94.a.f60365g).n(str);
        }
        if (i15 == 2) {
            return this.labelProvider.c(f94.a.f60363e).n(str);
        }
        if (i15 == 3) {
            return mx.b.b("-", str);
        }
        throw new oq.p();
    }

    private final DefaultSingleCardData h(FinalBehaviourGrade grade, er.a<i0> onShowFullBehaviourGradeText) {
        Integer numE = E(grade.getIconType());
        return new DefaultSingleCardData("finalGradeItem", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(mx.b.b(this.dateFormatter.c(grade.getDate()), "finalGrade_date"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(grade.getTitle(), "finalGrade_typeLabel"), null, null, 2, 0, null, 54, null)), new SingleCardLabel(mx.b.b(grade.getDescription(), "finalGrade_value"), null, null, 0, 0, null, 62, null)), numE != null ? new LeadingSection(false, null, new n50.i.Icon(numE.intValue(), null, G(grade.getIconType()), null, null, 26, null), 3, null) : null, grade.getDescriptive() ? new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(f94.a.f60361c), null, 2, null), k30.d.a.f107773a, null, onShowFullBehaviourGradeText, 35, null)) : null, null, 2300, null);
    }

    private final BaseScaffoldData i(er.a<i0> onHide) {
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), onHide), this.labelProvider.c(f94.a.f60370l), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    private final CardListData l(List<PartialBehaviourGrade> grades, final l<? super PartialBehaviourGrade, i0> onGradeSelected) {
        ArrayList<PartialBehaviourGrade> arrayList = new ArrayList();
        for (Object obj : grades) {
            if (((PartialBehaviourGrade) obj).getType() != g.UNKNOWN) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        for (final PartialBehaviourGrade partialBehaviourGrade : arrayList) {
            String str = "partialGradeItem_" + partialBehaviourGrade.getId();
            Integer numF = F(partialBehaviourGrade.getType());
            LeadingSection leadingSection = numF != null ? new LeadingSection(false, null, new n50.i.Icon(numF.intValue(), null, H(partialBehaviourGrade.getType()), null, null, 26, null), 3, null) : null;
            arrayList2.add(new DefaultSingleCardData(str, new er.a() { // from class: o94.a
                @Override // er.a
                public final Object a() {
                    return d.m(onGradeSelected, partialBehaviourGrade);
                }
            }, false, null, null, false, null, null, new BodySection(new SingleCardLabel(mx.b.b(this.dateFormatter.c(partialBehaviourGrade.getDate()), "partialGrade_date_" + partialBehaviourGrade.getId()), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(I(partialBehaviourGrade.getType(), "partialGrade_type_" + partialBehaviourGrade.getId()), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b(partialBehaviourGrade.getAuthor(), "partialGrade_author_" + partialBehaviourGrade.getId()), null, null, 0, 0, null, 62, null)), leadingSection, x0.Icon.INSTANCE.b(), null, 2300, null));
        }
        return new CardListData(arrayList2, null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, PartialBehaviourGrade partialBehaviourGrade) {
        lVar.b(partialBehaviourGrade);
        return i0.f148189a;
    }

    private final BaseScaffoldData q(er.a<i0> onBack) {
        return new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new x50.i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBack), this.labelProvider.c(f94.a.f60368j), null, null, false, null, 60, null), null, null, null, null, 60, null);
    }

    private final e.a.DisplayingBehaviorList s(m94.d.DisplayingBehaviorList state, final Params params) {
        BehaviorSemesterDetails behaviorSemesterDetailsD = state.getData().d();
        List<BehaviorSemesterDetails> listC = state.getData().c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (!t.c(((BehaviorSemesterDetails) obj).getId(), state.getData().getSelectedSemesterId())) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        BehaviourGradeInfo gradeInfo = behaviorSemesterDetailsD.getGradeInfo();
        boolean z15 = (gradeInfo == null || fu.r.t0(gradeInfo.getTitle()) || fu.r.t0(gradeInfo.getMessage())) ? false : true;
        BehaviorListData data = state.getData();
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldDataQ = q(params.a());
        Label labelB = !zIsEmpty ? mx.b.b(behaviorSemesterDetailsD.getTitle(), "behaviorList_semesterTitle") : null;
        ButtonTextData buttonTextData = !zIsEmpty ? new ButtonTextData(null, this.labelProvider.c(f94.a.f60359a), null, this.labelProvider.c(f94.a.f60362d), params.b(), 5, null) : null;
        EmptyStateData emptyStateData = z15 ? new EmptyStateData(mx.b.b(gradeInfo.getTitle(), "behaviorList_breakTitle"), mx.b.b(gradeInfo.getMessage(), "behaviorList_breakMessage"), null, 4, null) : null;
        DefaultSingleCardData defaultSingleCardDataH = (z15 || behaviorSemesterDetailsD.getFinalGrade() == null) ? null : h(behaviorSemesterDetailsD.getFinalGrade(), params.g());
        CardListData cardListDataL = (z15 || behaviorSemesterDetailsD.d().isEmpty()) ? null : l(behaviorSemesterDetailsD.d(), params.d());
        Label labelC = this.labelProvider.c(f94.a.f60369k);
        EmptyStateData emptyStateData2 = (z15 || !behaviorSemesterDetailsD.d().isEmpty()) ? null : new EmptyStateData(null, this.labelProvider.c(f94.a.f60367i), null, 4, null);
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(state.getIsBottomSheetVisible() ? g30.v.EXPANDED : g30.v.HIDDEN, false, new l() { // from class: o94.b
            @Override // er.l
            public final Object b(Object obj2) {
                return d.u(params, (g30.v) obj2);
            }
        }, 2, null), null, params.c(), null, 10, null);
        List<BehaviorSemesterDetails> listC2 = state.getData().c();
        ArrayList arrayList2 = new ArrayList(v.y(listC2, 10));
        Iterator it = listC2.iterator();
        while (it.hasNext()) {
            final BehaviorSemesterDetails behaviorSemesterDetails = (BehaviorSemesterDetails) it.next();
            arrayList2.add(new SemesterSheetItemData(behaviorSemesterDetails.getId(), mx.b.b(behaviorSemesterDetails.getTitle(), "semesterSheet_" + behaviorSemesterDetails.getId()), new er.a() { // from class: o94.c
                @Override // er.a
                public final Object a() {
                    return d.v(params, behaviorSemesterDetails);
                }
            }));
            it = it;
            data = data;
        }
        return new e.a.DisplayingBehaviorList(data, aVarA, baseScaffoldDataQ, labelB, buttonTextData, emptyStateData, defaultSingleCardDataH, labelC, cardListDataL, emptyStateData2, modalBottomSheetData, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, g30.v vVar) {
        if (vVar == g30.v.HIDDEN) {
            params.c().a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, BehaviorSemesterDetails behaviorSemesterDetails) {
        params.f().b(behaviorSemesterDetails.getId());
        return i0.f148189a;
    }

    private final e.a.DisplayingFullBehaviourGradeText x(m94.d.DisplayingFullBehaviourGradeText state, Params params) {
        BaseScaffoldData baseScaffoldDataI = i(params.e());
        FinalBehaviourGrade finalGrade = state.getData().d().getFinalGrade();
        return new e.a.DisplayingFullBehaviourGradeText(baseScaffoldDataI, mx.b.d(finalGrade != null ? finalGrade.getTitle() : null, "behaviourList_fullGradeText"), params.e());
    }

    private final e.a.EmptyState z(m94.d.BehaviorEmptyState state, Params params) {
        BaseScaffoldData baseScaffoldDataQ = q(params.a());
        String title = state.getMessage().getTitle();
        return new e.a.EmptyState(baseScaffoldDataQ, new EmptyStateData(title != null ? mx.b.b(title, "behaviorList_emptyStateTitle") : null, mx.b.b(state.getMessage().getMessage(), "behaviorList_emptyStateMessage"), null, 4, null), this.labelProvider.c(f94.a.f60369k));
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        m94.d state = params.getState();
        if (state instanceof m94.d.e) {
            return e.a.C3074e.f124888a;
        }
        if (state instanceof m94.d.BehaviorEmptyState) {
            return z((m94.d.BehaviorEmptyState) state, params);
        }
        if (state instanceof m94.d.DisplayingBehaviorList) {
            return s((m94.d.DisplayingBehaviorList) state, params);
        }
        if (state instanceof m94.d.DisplayingFullBehaviourGradeText) {
            return x((m94.d.DisplayingFullBehaviourGradeText) state, params);
        }
        if (state instanceof m94.d.ErrorLoadingInitialData) {
            return new e.a.ErrorLoadingInitialData(((m94.d.ErrorLoadingInitialData) state).getErrorVMS());
        }
        throw new oq.p();
    }
}
