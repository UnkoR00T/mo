package gs3;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import cj0.ZusEVisitDepartment;
import er.l;
import fr.t;
import h30.ButtonData;
import j40.DropDownButtonData;
import j40.m;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgs3/e;", "Lxw/f;", "Lgs3/e$a;", "Lfs3/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lhs3/b;", "", "departmentStringResId", "polandStringResId", "Lmx/a;", "i", "(Lhs3/b;II)Lmx/a;", "z", "(Lhs3/b;)Lmx/a;", "x", "u", "v", "params", "l", "(Lgs3/e$a;)Lfs3/c$a;", "a", "Lmx/c;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, fs3.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gs3.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b!\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b\u0019\u0010#¨\u0006&"}, d2 = {"Lgs3/e$a;", "", "Lhs3/b;", "type", "Lfs3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onOpenDropDown", "Lkotlin/Function1;", "Lhs3/a;", "onSelectRadioButton", "onNextButtonClick", "<init>", "(Lhs3/b;Lfs3/b;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhs3/b;", "e", "()Lhs3/b;", "b", "Lfs3/b;", "d", "()Lfs3/b;", "c", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hs3.b type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final fs3.b state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenDropDown;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<hs3.a, i0> onSelectRadioButton;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(hs3.b bVar, fs3.b bVar2, er.a<i0> aVar, l<? super hs3.a, i0> lVar, er.a<i0> aVar2) {
            this.type = bVar;
            this.state = bVar2;
            this.onOpenDropDown = aVar;
            this.onSelectRadioButton = lVar;
            this.onNextButtonClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.onNextButtonClick;
        }

        public final er.a<i0> b() {
            return this.onOpenDropDown;
        }

        public final l<hs3.a, i0> c() {
            return this.onSelectRadioButton;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final fs3.b getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final hs3.b getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.type == params.type && t.c(this.state, params.state) && t.c(this.onOpenDropDown, params.onOpenDropDown) && t.c(this.onSelectRadioButton, params.onSelectRadioButton) && t.c(this.onNextButtonClick, params.onNextButtonClick);
        }

        public int hashCode() {
            return (((((((this.type.hashCode() * 31) + this.state.hashCode()) * 31) + this.onOpenDropDown.hashCode()) * 31) + this.onSelectRadioButton.hashCode()) * 31) + this.onNextButtonClick.hashCode();
        }

        public String toString() {
            return "Params(type=" + this.type + ", state=" + this.state + ", onOpenDropDown=" + this.onOpenDropDown + ", onSelectRadioButton=" + this.onSelectRadioButton + ", onNextButtonClick=" + this.onNextButtonClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f76678b;

        static {
            int[] iArr = new int[hs3.b.values().length];
            try {
                iArr[hs3.b.DEPARTMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hs3.b.POLAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f76677a = iArr;
            int[] iArr2 = new int[hs3.a.values().length];
            try {
                iArr2[hs3.a.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[hs3.a.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f76678b = iArr2;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label i(hs3.b bVar, int i15, int i16) {
        mx.c cVar = this.labelProvider;
        int i17 = b.f76677a[bVar.ordinal()];
        if (i17 != 1) {
            if (i17 != 2) {
                throw new p();
            }
            i15 = i16;
        }
        return cVar.c(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.c().b(hs3.a.POSITIVE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.c().b(hs3.a.NEGATIVE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, DropDownButtonData dropDownButtonData) {
        params.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, DropDownButtonData dropDownButtonData) {
        params.b().a();
        return i0.f148189a;
    }

    private final Label u(hs3.b bVar) {
        return i(bVar, ir3.a.f96796k, ir3.a.f96841z);
    }

    private final Label v(hs3.b bVar) {
        return i(bVar, ir3.a.f96784g, ir3.a.f96804m1);
    }

    private final Label x(hs3.b bVar) {
        return i(bVar, ir3.a.f96826u, ir3.a.N);
    }

    private final Label z(hs3.b bVar) {
        return i(bVar, ir3.a.T0, ir3.a.U0);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ec  */
    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public fs3.c.a b(final Params params) {
        DropDownButtonData dropDownButtonData;
        if (!(params.getState() instanceof fs3.b.Initialized)) {
            return fs3.c.a.b.f66900a;
        }
        boolean z15 = ((fs3.b.Initialized) params.getState()).getSelectedRadio() != null && ((((fs3.b.Initialized) params.getState()).getSelectedRadio() == hs3.a.POSITIVE && params.getType() == hs3.b.POLAND) || ((fs3.b.Initialized) params.getState()).getSelectedDepartment() != null);
        Label labelC = this.labelProvider.c(ir3.a.W0);
        Label labelZ = z(params.getType());
        RadioButtonData radioButtonData = new RadioButtonData(v.q(new RadioButtonRow(new RadioButtonItemData(false, ((fs3.b.Initialized) params.getState()).getSelectedRadio() == hs3.a.POSITIVE, false, 5, null), new er.a() { // from class: gs3.a
            @Override // er.a
            public final Object a() {
                return e.m(params);
            }
        }, x(params.getType()), null, null, 24, null), new RadioButtonRow(new RadioButtonItemData(false, ((fs3.b.Initialized) params.getState()).getSelectedRadio() == hs3.a.NEGATIVE, false, 5, null), new er.a() { // from class: gs3.b
            @Override // er.a
            public final Object a() {
                return e.q(params);
            }
        }, u(params.getType()), null, null, 24, null)), b50.e.b.f16685a, null, null, null, null, null, 124, null);
        hs3.a selectedRadio = ((fs3.b.Initialized) params.getState()).getSelectedRadio();
        int i15 = selectedRadio == null ? -1 : b.f76678b[selectedRadio.ordinal()];
        if (i15 == 1) {
            if (b.f76677a[params.getType().ordinal()] == 1) {
                Label labelC2 = this.labelProvider.c(ir3.a.Y0);
                List<ZusEVisitDepartment> listB = ((fs3.b.Initialized) params.getState()).getDepartments().b();
                ArrayList arrayList = new ArrayList(v.y(listB, 10));
                int i16 = 0;
                for (Object obj : listB) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        v.x();
                    }
                    arrayList.add(mx.b.b(((ZusEVisitDepartment) obj).getName(), "departmentName_" + i16));
                    i16 = i17;
                }
                Label labelC3 = this.labelProvider.c(ir3.a.f96784g);
                Integer numValueOf = Integer.valueOf(v.q0(((fs3.b.Initialized) params.getState()).getDepartments().b(), ((fs3.b.Initialized) params.getState()).getSelectedDepartment()));
                dropDownButtonData = new DropDownButtonData(labelC2, arrayList, numValueOf.intValue() >= 0 ? numValueOf : null, new m.Enabled(this.labelProvider.c(ir3.a.X0)), labelC3, false, null, new l() { // from class: gs3.c
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return e.r(params, (DropDownButtonData) obj2);
                    }
                }, 96, null);
            } else {
                dropDownButtonData = null;
            }
        } else if (i15 != 2) {
            dropDownButtonData = null;
        } else {
            Label labelC4 = this.labelProvider.c(ir3.a.f96831v1);
            List<ZusEVisitDepartment> listA = ((fs3.b.Initialized) params.getState()).getDepartments().a();
            ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
            int i18 = 0;
            for (Object obj2 : listA) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    v.x();
                }
                arrayList2.add(mx.b.b(((ZusEVisitDepartment) obj2).getName(), "departmentName_" + i18));
                i18 = i19;
            }
            Label labelV = v(params.getType());
            Integer numValueOf2 = Integer.valueOf(v.q0(((fs3.b.Initialized) params.getState()).getDepartments().a(), ((fs3.b.Initialized) params.getState()).getSelectedDepartment()));
            dropDownButtonData = new DropDownButtonData(labelC4, arrayList2, numValueOf2.intValue() >= 0 ? numValueOf2 : null, new m.Enabled(this.labelProvider.c(ir3.a.Z0)), labelV, false, null, new l() { // from class: gs3.d
                @Override // er.l
                public final Object b(Object obj3) {
                    return e.s(params, (DropDownButtonData) obj3);
                }
            }, 96, null);
        }
        return new fs3.c.a.Displayed(labelC, labelZ, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ir3.a.f96820s), null, 2, null), k30.d.a.f107773a, z15 ? k30.b.c.f107768a : k30.b.C2562b.f107767a, params.a(), 3, null), radioButtonData, dropDownButtonData);
    }
}
