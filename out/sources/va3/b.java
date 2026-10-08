package va3;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k30.d;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import ua3.State;
import ua3.h;
import v93.Contact;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n*\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u001a*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\u001a*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\u001a*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u00020\u0013*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010+\u001a\u0004\u0018\u00010\u0018*\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lva3/b;", "Lxw/f;", "Lva3/b$a;", "Lua3/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lv93/b;", "", "Lv93/a;", "Lkotlin/Function1;", "Loq/i0;", "onClick", "Lua3/h$a$a;", "s", "(Ljava/util/Map;Ler/l;)Ljava/util/List;", "contactType", "", "parentIndex", "Ln50/g;", "q", "(Ljava/util/List;Lv93/b;Ler/l;I)Ljava/util/List;", "", "tag", "Lmx/a;", "l", "(Lv93/a;Lv93/b;Ljava/lang/String;)Lmx/a;", "m", "i", "(Lv93/a;Ljava/lang/String;)Lmx/a;", "params", "h", "(Lva3/b$a;)Lua3/h$a;", "a", "Lmx/c;", "f", "(Lv93/b;)I", "labelResId", "Lv93/a$a;", "e", "(Lv93/a$a;)Ljava/lang/String;", "additionalInfo", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, h.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: va3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lva3/b$a;", "", "Lua3/g;", "state", "Lkotlin/Function1;", "Lv93/a;", "Loq/i0;", "onClick", "Lkotlin/Function0;", "onBack", "<init>", "(Lua3/g;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lua3/g;", "c", "()Lua3/g;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Contact, i0> onClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super Contact, i0> lVar, er.a<i0> aVar) {
            this.state = state;
            this.onClick = lVar;
            this.onBack = aVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<Contact, i0> b() {
            return this.onClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onClick, params.onClick) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onClick.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClick=" + this.onClick + ", onBack=" + this.onBack + ')';
        }
    }

    /* JADX INFO: renamed from: va3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5375b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f205732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f205733b;

        static {
            int[] iArr = new int[v93.b.values().length];
            try {
                iArr[v93.b.FACILITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v93.b.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f205732a = iArr;
            int[] iArr2 = new int[Contact.EnumC5364a.values().length];
            try {
                iArr2[Contact.EnumC5364a.LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Contact.EnumC5364a.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Contact.EnumC5364a.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Contact.EnumC5364a.URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Contact.EnumC5364a.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f205733b = iArr2;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final String e(Contact.EnumC5364a enumC5364a) {
        Integer numValueOf;
        Label labelC;
        int i15 = C5375b.f205733b[enumC5364a.ordinal()];
        if (i15 == 1) {
            numValueOf = Integer.valueOf(r93.a.f172501o0);
        } else if (i15 == 2) {
            numValueOf = Integer.valueOf(r93.a.f172504p0);
        } else if (i15 == 3) {
            numValueOf = Integer.valueOf(r93.a.f172498n0);
        } else if (i15 == 4) {
            numValueOf = Integer.valueOf(r93.a.f172510r0);
        } else {
            if (i15 != 5) {
                throw new p();
            }
            numValueOf = null;
        }
        if (numValueOf == null || (labelC = this.labelProvider.c(numValueOf.intValue())) == null) {
            return null;
        }
        return labelC.getText();
    }

    private final int f(v93.b bVar) {
        int i15 = C5375b.f205732a[bVar.ordinal()];
        if (i15 == 1) {
            return r93.a.f172513s0;
        }
        if (i15 == 2) {
            return r93.a.f172519u0;
        }
        throw new p();
    }

    private final Label i(Contact contact, String str) {
        int i15;
        int i16 = C5375b.f205733b[contact.getType().ordinal()];
        if (i16 == 1) {
            i15 = r93.a.D;
        } else if (i16 == 2) {
            i15 = r93.a.f172464c;
        } else if (i16 == 3) {
            i15 = r93.a.f172491l;
        } else if (i16 != 4) {
            if (i16 != 5) {
                throw new p();
            }
            i15 = r93.a.f172491l;
        } else {
            i15 = r93.a.f172533z;
        }
        return this.labelProvider.c(i15).n(str);
    }

    private final Label l(Contact contact, v93.b bVar, String str) {
        String str2;
        String string;
        int i15 = C5375b.f205732a[bVar.ordinal()];
        if (i15 == 1) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(contact.getName());
            String strE = e(contact.getType());
            if (strE != null) {
                str2 = '\n' + strE;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            sb5.append(str2);
            string = sb5.toString();
        } else {
            if (i15 != 2) {
                throw new p();
            }
            string = contact.getValue();
        }
        return mx.b.b(string, str);
    }

    private final Label m(Contact contact, v93.b bVar, String str) {
        String value;
        int i15 = C5375b.f205732a[bVar.ordinal()];
        if (i15 == 1) {
            value = contact.getValue();
        } else {
            if (i15 != 2) {
                throw new p();
            }
            value = contact.getName();
        }
        return mx.b.b(value, str);
    }

    private final List<DefaultSingleCardData> q(List<Contact> list, v93.b bVar, final l<? super Contact, i0> lVar, int i15) {
        List<Contact> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i16 = 0;
        for (Object obj : list2) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                v.x();
            }
            final Contact contact = (Contact) obj;
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(l(contact, bVar, "info#" + i15 + i16), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(m(contact, bVar, "title#" + i15 + i16), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(i(contact, "button#" + i15 + i16), null, 2, null), d.a.f107773a, null, new er.a() { // from class: va3.a
                @Override // er.a
                public final Object a() {
                    return b.r(lVar, contact);
                }
            }, 35, null)), null, 2815, null));
            i16 = i17;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(l lVar, Contact contact) {
        lVar.b(contact);
        return i0.f148189a;
    }

    private final List<h.Data.Section> s(Map<v93.b, ? extends List<Contact>> map, l<? super Contact, i0> lVar) {
        Set<Map.Entry<v93.b, ? extends List<Contact>>> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(v.y(setEntrySet, 10));
        int i15 = 0;
        for (Object obj : setEntrySet) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            Map.Entry entry = (Map.Entry) obj;
            arrayList.add(new h.Data.Section(this.labelProvider.c(f((v93.b) entry.getKey())), new CardListData(q((List) entry.getValue(), (v93.b) entry.getKey(), lVar, i15), null, false, null, null, 30, null)));
            i15 = i16;
        }
        return arrayList;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public h.Data b(Params params) {
        return new h.Data(new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(r93.a.f172507q0), null, null, false, null, 60, null), null, null, null, null, 60, null), s(params.getState().a(), params.b()));
    }
}
