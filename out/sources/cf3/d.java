package cf3;

import bf3.State;
import dx.i;
import dx.j;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.g;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import sv0.StatementVehicleDetails;
import sv0.VehicleCompanyOwner;
import sv0.VehiclePhysicalOwner;
import sv0.l;
import sv0.m0;
import x50.NavigationButtonData;
import xw.PhoneNumber;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002*(B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020\u001d*\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u0015*\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcf3/d;", "Lxw/f;", "Lcf3/d$b;", "Lbf3/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lsv0/u0;", "companyOwner", "", "Ln50/g;", "i", "(Lsv0/u0;)Ljava/util/List;", "Lsv0/w0;", "physicalOwners", "l", "(Ljava/util/List;)Ljava/util/List;", "physicalOwner", "m", "(Lsv0/w0;)Ljava/util/List;", "Lmx/a;", "", "listIndex", "h", "(Lmx/a;I)Lmx/a;", "Liy/b0;", "name", "surname", "", "q", "(Liy/b0;Liy/b0;)Ljava/lang/String;", "Lxw/h;", "z", "(Lxw/h;)Ljava/lang/String;", "x", "(I)Lmx/a;", "params", "r", "(Lcf3/d$b;)Lbf3/d$a;", "a", "Lmx/c;", "b", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, bf3.d.Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f25698c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: cf3.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, d2 = {"Lcf3/d$b;", "", "Lbf3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "Lkotlin/Function2;", "Liy/b0;", "Lmx/a;", "onCopyToClipboard", "<init>", "(Lbf3/c;Ler/a;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbf3/c;", "c", "()Lbf3/c;", "b", "Ler/a;", "()Ler/a;", "Ler/p;", "()Ler/p;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<b0, Label, i0> onCopyToClipboard;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, p<? super b0, ? super Label, i0> pVar) {
            this.state = state;
            this.onClose = aVar;
            this.onCopyToClipboard = pVar;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        public final p<b0, Label, i0> b() {
            return this.onCopyToClipboard;
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
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose) && t.c(this.onCopyToClipboard, params.onCopyToClipboard);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.onCopyToClipboard.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ", onCopyToClipboard=" + this.onCopyToClipboard + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f25704b;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.VICTIM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.PERPETRATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25703a = iArr;
            int[] iArr2 = new int[m0.values().length];
            try {
                iArr2[m0.OWNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[m0.CO_OWNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[m0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f25704b = iArr2;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label h(Label label, int i15) {
        return Label.h(label, label.getText() + " (" + (i15 + 1) + ')', null, 2, null);
    }

    private final List<DefaultSingleCardData> i(VehicleCompanyOwner companyOwner) {
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(x(md3.b.f125745i5).n("CompanyOwnerName"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(c0.e(companyOwner.getName()), "CompanyOwnerNameValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(x(md3.b.f125753j5).n("CompanyOwnerPhoneNumber"), null, null, 0, 0, null, 62, null);
        PhoneNumber phoneNumber = companyOwner.getPhoneNumber();
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(phoneNumber != null ? z(phoneNumber) : null, "CompanyOwnerPhoneNumberValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel2 = new SingleCardLabel(x(md3.b.f125737h5).n("CompanyOwnerEmail"), null, null, 0, 0, null, 62, null);
        b0 email = companyOwner.getEmail();
        return v.q(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.d(email != null ? c0.e(email) : null, "CompanyOwnerEmailValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
    }

    private final List<DefaultSingleCardData> l(List<VehiclePhysicalOwner> physicalOwners) {
        List<VehiclePhysicalOwner> list = physicalOwners;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            VehiclePhysicalOwner vehiclePhysicalOwner = (VehiclePhysicalOwner) obj;
            DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(h(x(md3.b.f125713e5), i15).n("PhysicalOwnerName_" + i15), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(q(vehiclePhysicalOwner.getName(), vehiclePhysicalOwner.getSurname()), "PhysicalOwnerNameValue_" + i15), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            SingleCardLabel singleCardLabel = new SingleCardLabel(h(x(md3.b.f125721f5), i15).n("PhysicalOwnerPhoneNumber_" + i15), null, null, 0, 0, null, 62, null);
            PhoneNumber phoneNumber = vehiclePhysicalOwner.getPhoneNumber();
            String strE = null;
            DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(phoneNumber != null ? z(phoneNumber) : null, "PhysicalOwnerPhoneNumberValue_" + i15), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            SingleCardLabel singleCardLabel2 = new SingleCardLabel(h(x(md3.b.f125705d5), i15).n("PhysicalOwnerEmail_" + i15), null, null, 0, 0, null, 62, null);
            b0 email = vehiclePhysicalOwner.getEmail();
            if (email != null) {
                strE = c0.e(email);
            }
            arrayList.add(v.q(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.d(strE, "PhysicalOwnerEmailValue_" + i15), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)));
            i15 = i16;
        }
        return v.A(arrayList);
    }

    private final List<DefaultSingleCardData> m(VehiclePhysicalOwner physicalOwner) {
        i left;
        Object objB;
        b0 email;
        PhoneNumber phoneNumber;
        SingleCardLabel singleCardLabel = new SingleCardLabel(x(md3.b.f125769l5).n("PhysicalOwnerName"), null, null, 0, 0, null, 62, null);
        j<dx.b> jVarA = xw.c.f221622a.a();
        String strE = null;
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    b0 name = physicalOwner != null ? physicalOwner.getName() : null;
                    if (name == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new g();
                    }
                    b0 surname = physicalOwner != null ? physicalOwner.getSurname() : null;
                    if (surname == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new g();
                    }
                    left = new i.Right(q(name, surname));
                    DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d((String) left.a(), "PhysicalOwnerNameValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
                    DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(x(md3.b.f125777m5).n("PhysicalOwnerPhoneNumber"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d((physicalOwner == null || (phoneNumber = physicalOwner.getPhoneNumber()) == null) ? null : z(phoneNumber), "PhysicalOwnerPhoneNumberValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
                    SingleCardLabel singleCardLabel2 = new SingleCardLabel(x(md3.b.f125761k5).n("PhysicalOwnerEmail"), null, null, 0, 0, null, 62, null);
                    if (physicalOwner != null && (email = physicalOwner.getEmail()) != null) {
                        strE = c0.e(email);
                    }
                    return v.q(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.d(strE, "PhysicalOwnerEmailValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    left = new i.Left(objB);
                }
            } catch (ex.c e16) {
                left = new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final String q(b0 name, b0 surname) {
        return c0.e(name) + " " + c0.e(surname);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, State state, d dVar) {
        params.b().B(c0.g(state.getVehicleDetailsData().getVehicleData().n()), dVar.x(md3.b.f125809q5));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, State state, d dVar) {
        params.b().B(state.getVehicleDetailsData().getVehicleData().getRegistrationNumber(), dVar.x(md3.b.f125801p5));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, State state, d dVar) {
        params.b().B(state.getVehicleDetailsData().getVehicleData().getVinNumber(), dVar.x(md3.b.f125817r5));
        return i0.f148189a;
    }

    private final Label x(int i15) {
        return this.labelProvider.c(i15);
    }

    private final String z(PhoneNumber phoneNumber) {
        return c0.e(phoneNumber.h()) + " " + c0.e(phoneNumber.g());
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public bf3.d.Data b(final Params params) {
        Label labelC;
        Label labelC2;
        Label labelC3;
        List<DefaultSingleCardData> listL;
        final State state = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(md3.b.f125825s5), null, null, null, 28, null), null, null, null, null, 61, null);
        l role = state.getVehicleDetailsData().getRole();
        int[] iArr = c.f25703a;
        int i15 = iArr[role.ordinal()];
        if (i15 == 1) {
            labelC = this.labelProvider.c(md3.b.Z5);
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            labelC = this.labelProvider.c(md3.b.X5);
        }
        BodySection bodySection = new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.f125825s5), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getVehicleDetailsData().getVehicleData().n(), "vehicleName"), null, null, 0, 0, null, 62, null)), null, 4, null);
        k30.a.b bVar = k30.a.b.f107765a;
        k30.d.a aVar = k30.d.a.f107773a;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, state.getVehicleDetailsData().getCopyEnabled() ? new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(this.labelProvider.c(md3.b.f125747j), null, 2, null), aVar, null, new er.a() { // from class: cf3.a
            @Override // er.a
            public final Object a() {
                return d.s(params, state, this);
            }
        }, 35, null)) : null, null, 2815, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.Y5), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getVehicleDetailsData().getVehicleData().getKind(), "vehicleType"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.A5), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getVehicleDetailsData().getVehicleData().getRegistrationNumber()), "plateNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, state.getVehicleDetailsData().getCopyEnabled() ? new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(this.labelProvider.c(md3.b.f125747j), null, 2, null), aVar, null, new er.a() { // from class: cf3.b
            @Override // er.a
            public final Object a() {
                return d.u(params, state, this);
            }
        }, 35, null)) : null, null, 2815, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.f125682a6), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getVehicleDetailsData().getVehicleData().getVinNumber()), "vin"), null, null, 0, 0, null, 62, null)), null, 4, null), null, state.getVehicleDetailsData().getCopyEnabled() ? new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(this.labelProvider.c(md3.b.f125747j), null, 2, null), aVar, null, new er.a() { // from class: cf3.c
            @Override // er.a
            public final Object a() {
                return d.v(params, state, this);
            }
        }, 35, null)) : null, null, 2815, null);
        DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.f125690b6), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getVehicleDetailsData().getVehicleData().getProductionYear(), "productionYear"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        int i16 = iArr[state.getVehicleDetailsData().getRole().ordinal()];
        if (i16 == 1) {
            labelC2 = this.labelProvider.c(md3.b.f125833t5);
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            labelC2 = this.labelProvider.c(md3.b.f125793o5);
        }
        SingleCardLabel singleCardLabel = new SingleCardLabel(labelC2, null, null, 0, 0, null, 62, null);
        int i17 = c.f25704b[state.getVehicleDetailsData().getVehicleData().getCardOwnershipType().ordinal()];
        if (i17 == 1) {
            labelC3 = this.labelProvider.c(md3.b.f125785n5);
        } else if (i17 == 2) {
            labelC3 = this.labelProvider.c(md3.b.f125729g5);
        } else {
            if (i17 != 3) {
                throw new oq.p();
            }
            labelC3 = this.labelProvider.c(md3.b.L);
        }
        List listQ = v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, defaultSingleCardData5, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(labelC3, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        StatementVehicleDetails vehicleData = state.getVehicleDetailsData().getVehicleData();
        if (vehicleData.getCardOwnershipType() != m0.NONE) {
            listL = null;
        } else {
            VehicleCompanyOwner companyOwner = vehicleData.getCompanyOwner();
            if (companyOwner != null) {
                listL = i(companyOwner);
            } else {
                listL = vehicleData.j().size() > 1 ? l(vehicleData.j()) : m((VehiclePhysicalOwner) v.n0(vehicleData.j()));
            }
        }
        return new bf3.d.Data(baseScaffoldData, labelC, new CardListData(v.A(v.s(listQ, listL)), null, false, null, null, 30, null));
    }
}
