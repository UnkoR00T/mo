package wr1;

import er.l;
import fr.t;
import fu.r;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import r54.LocalDocumentNotification;
import r54.LocalVehicleNotification;
import vr1.DocumentListItem;
import vr1.DropDownDocumentListData;
import vr1.LocalNotificationItem;
import x50.NavigationButtonData;
import x50.i;
import y30.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lwr1/h;", "Lxw/f;", "Lwr1/h$a;", "Lur1/d$a;", "Lez/e;", "dateFormatter", "Lez/c;", "dateConverter", "<init>", "(Lez/e;Lez/c;)V", "", "Lrq0/b;", "documentList", "Lvr1/b;", "F", "(Ljava/util/List;)Ljava/util/List;", "params", "q", "(Lwr1/h$a;)Lur1/d$a;", "a", "Lez/e;", "b", "Lez/c;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, ur1.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: wr1.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b#\u0010)R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010)R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b*\u0010)R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010/R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b,\u0010/R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b'\u0010/R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b2\u0010/R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b0\u0010/¨\u00064"}, d2 = {"Lwr1/h$a;", "", "Lur1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onSendNotification", "onRemoveNotification", "Lkotlin/Function1;", "Lg30/v;", "onSheetValueChange", "Lvr1/b;", "onSelectedItem", "Lvr1/a;", "openDatePickerDialog", "", "setRegisterNo", "Lr54/a;", "onDocumentNotificationClick", "Lr54/d;", "onVehicleNotificationClick", "Ly30/n$b$b;", "onSwitchItemChanged", "<init>", "(Lur1/b;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lur1/b;", "k", "()Lur1/b;", "b", "Ler/a;", "()Ler/a;", "c", "e", "d", "Ler/l;", "f", "()Ler/l;", "g", "i", "h", "j", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ur1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSendNotification;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRemoveNotification;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> onSheetValueChange;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DocumentListItem, i0> onSelectedItem;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<vr1.a, i0> openDatePickerDialog;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> setRegisterNo;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<LocalDocumentNotification, i0> onDocumentNotificationClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<LocalVehicleNotification, i0> onVehicleNotificationClick;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n.Switch.EnumC5973b, i0> onSwitchItemChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ur1.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super v, i0> lVar, l<? super DocumentListItem, i0> lVar2, l<? super vr1.a, i0> lVar3, l<? super String, i0> lVar4, l<? super LocalDocumentNotification, i0> lVar5, l<? super LocalVehicleNotification, i0> lVar6, l<? super n.Switch.EnumC5973b, i0> lVar7) {
            this.state = bVar;
            this.onBackAction = aVar;
            this.onSendNotification = aVar2;
            this.onRemoveNotification = aVar3;
            this.onSheetValueChange = lVar;
            this.onSelectedItem = lVar2;
            this.openDatePickerDialog = lVar3;
            this.setRegisterNo = lVar4;
            this.onDocumentNotificationClick = lVar5;
            this.onVehicleNotificationClick = lVar6;
            this.onSwitchItemChanged = lVar7;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<LocalDocumentNotification, i0> b() {
            return this.onDocumentNotificationClick;
        }

        public final er.a<i0> c() {
            return this.onRemoveNotification;
        }

        public final l<DocumentListItem, i0> d() {
            return this.onSelectedItem;
        }

        public final er.a<i0> e() {
            return this.onSendNotification;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onSendNotification, params.onSendNotification) && t.c(this.onRemoveNotification, params.onRemoveNotification) && t.c(this.onSheetValueChange, params.onSheetValueChange) && t.c(this.onSelectedItem, params.onSelectedItem) && t.c(this.openDatePickerDialog, params.openDatePickerDialog) && t.c(this.setRegisterNo, params.setRegisterNo) && t.c(this.onDocumentNotificationClick, params.onDocumentNotificationClick) && t.c(this.onVehicleNotificationClick, params.onVehicleNotificationClick) && t.c(this.onSwitchItemChanged, params.onSwitchItemChanged);
        }

        public final l<v, i0> f() {
            return this.onSheetValueChange;
        }

        public final l<n.Switch.EnumC5973b, i0> g() {
            return this.onSwitchItemChanged;
        }

        public final l<LocalVehicleNotification, i0> h() {
            return this.onVehicleNotificationClick;
        }

        public int hashCode() {
            return (((((((((((((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onSendNotification.hashCode()) * 31) + this.onRemoveNotification.hashCode()) * 31) + this.onSheetValueChange.hashCode()) * 31) + this.onSelectedItem.hashCode()) * 31) + this.openDatePickerDialog.hashCode()) * 31) + this.setRegisterNo.hashCode()) * 31) + this.onDocumentNotificationClick.hashCode()) * 31) + this.onVehicleNotificationClick.hashCode()) * 31) + this.onSwitchItemChanged.hashCode();
        }

        public final l<vr1.a, i0> i() {
            return this.openDatePickerDialog;
        }

        public final l<String, i0> j() {
            return this.setRegisterNo;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final ur1.b getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onSendNotification=" + this.onSendNotification + ", onRemoveNotification=" + this.onRemoveNotification + ", onSheetValueChange=" + this.onSheetValueChange + ", onSelectedItem=" + this.onSelectedItem + ", openDatePickerDialog=" + this.openDatePickerDialog + ", setRegisterNo=" + this.setRegisterNo + ", onDocumentNotificationClick=" + this.onDocumentNotificationClick + ", onVehicleNotificationClick=" + this.onVehicleNotificationClick + ", onSwitchItemChanged=" + this.onSwitchItemChanged + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f214625a;

        static {
            int[] iArr = new int[n.Switch.EnumC5973b.values().length];
            try {
                iArr[n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f214625a = iArr;
        }
    }

    public h(ez.e eVar, ez.c cVar) {
        this.dateFormatter = eVar;
        this.dateConverter = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params, String str) {
        params.j().b(str);
        return i0.f148189a;
    }

    private final List<DocumentListItem> F(List<? extends rq0.b> documentList) {
        List listE;
        List<? extends rq0.b> list = documentList;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        for (rq0.b bVar : list) {
            if (bVar == rq0.b.d.DRIVING_LICENCE) {
                DocumentListItem documentListItem = new DocumentListItem(mx.b.b("TEMPORARY_DRIVING_LICENCE", "TEMPORARY_DRIVING_LICENCE_TAG"), bVar, r54.b.TEMPORARY_DRIVING_LICENCE);
                String string = bVar.toString();
                listE = pq.v.q(documentListItem, new DocumentListItem(mx.b.b(string, string), bVar, null, 4, null));
            } else {
                String string2 = bVar.toString();
                listE = pq.v.e(new DocumentListItem(mx.b.b(string2, string2), bVar, null, 4, null));
            }
            arrayList.add(listE);
        }
        return pq.v.A(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, v vVar) {
        params.f().b(vVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params) {
        params.f().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, DocumentListItem documentListItem) {
        params.d().b(documentListItem);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, DropDownButtonData dropDownButtonData) {
        params.f().b(v.EXPANDED);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(LocalDocumentNotification localDocumentNotification, Params params) {
        if (localDocumentNotification.getStatus() != r54.e.DISPLAYED) {
            params.b().b(localDocumentNotification);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(LocalVehicleNotification localVehicleNotification, Params params) {
        if (localVehicleNotification.getStatus() != r54.e.DISPLAYED) {
            params.h().b(localVehicleNotification);
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ur1.d.a b(final Params params) {
        BaseScaffoldData baseScaffoldData;
        DropDownDocumentListData dropDownDocumentListData;
        er.a<i0> aVar;
        ArrayList arrayList;
        String strA;
        vr1.d localDocumentNotificationConfig;
        String strA2;
        String strA3;
        ur1.b state = params.getState();
        if (t.c(state, ur1.b.C5211b.f200170a)) {
            return ur1.d.a.b.f200202a;
        }
        if (!(state instanceof ur1.b.a)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), mx.b.b("Local Notifications", ""), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.d.a aVar2 = k30.d.a.f107773a;
        ButtonData buttonData = new ButtonData(null, null, large, new k30.c.WithText(mx.b.b("Ustaw notyfikację", ""), null, 2, null), aVar2, null, params.e(), 35, null);
        ButtonData buttonData2 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Usuń notyfikację", ""), null, 2, null), aVar2, null, params.c(), 35, null);
        ur1.b.a aVar3 = (ur1.b.a) state;
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(aVar3.getData().getSheetValue(), false, new l() { // from class: wr1.a
            @Override // er.l
            public final Object b(Object obj) {
                return h.r(params, (v) obj);
            }
        }), mx.b.b("Dokument", ""), new er.a() { // from class: wr1.b
            @Override // er.a
            public final Object a() {
                return h.s(params);
            }
        }, null, 8, null);
        DropDownDocumentListData dropDownDocumentListData2 = new DropDownDocumentListData(F(aVar3.getData().e()), aVar3.getData().getSelectedItem(), new l() { // from class: wr1.c
            @Override // er.l
            public final Object b(Object obj) {
                return h.u(params, (DocumentListItem) obj);
            }
        });
        Label labelC = Label.INSTANCE.c();
        DocumentListItem selectedItem = aVar3.getData().getSelectedItem();
        Integer numValueOf = selectedItem != null ? Integer.valueOf(F(aVar3.getData().e()).indexOf(selectedItem)) : null;
        List<DocumentListItem> listF = F(aVar3.getData().e());
        ArrayList arrayList2 = new ArrayList(pq.v.y(listF, 10));
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            arrayList2.add(((DocumentListItem) it.next()).getLabel());
        }
        DropDownButtonData dropDownButtonData = new DropDownButtonData(labelC, arrayList2, numValueOf, null, mx.b.b("Typ dokumentu...", "DocumentTypePlaceholder"), false, null, new l() { // from class: wr1.d
            @Override // er.l
            public final Object b(Object obj) {
                return h.v(params, (DropDownButtonData) obj);
            }
        }, 104, null);
        l<v, i0> lVarF = params.f();
        v sheetValue = aVar3.getData().getSheetValue();
        int i15 = b.f214625a[aVar3.getData().getSelectedItemSwitch().ordinal()];
        if (i15 == 1) {
            baseScaffoldData = baseScaffoldData2;
            dropDownDocumentListData = dropDownDocumentListData2;
            aVar = aVarA;
            List<LocalDocumentNotification> listG = aVar3.getData().g();
            arrayList = new ArrayList(pq.v.y(listG, 10));
            for (Iterator it4 = listG.iterator(); it4.hasNext(); it4 = it4) {
                final LocalDocumentNotification localDocumentNotification = (LocalDocumentNotification) it4.next();
                String documentSubType = localDocumentNotification.getDocumentSubType();
                if (documentSubType.length() <= 0) {
                    documentSubType = null;
                }
                if (documentSubType == null) {
                    documentSubType = localDocumentNotification.getDocumentType();
                }
                String lowerCase = pq.v.v0(r.V0(documentSubType, new String[]{"_"}, false, 0, 6, null), " ", null, null, 0, null, null, 62, null).toLowerCase(Locale.ROOT);
                ez.e eVar = this.dateFormatter;
                fz.b.LocalDate localDate = new fz.b.LocalDate(localDocumentNotification.getExpirationDate());
                fz.c cVar = fz.c.DOTTED;
                arrayList.add(new LocalNotificationItem(lowerCase, eVar.d(localDate, cVar), this.dateFormatter.d(new fz.b.LocalDate(localDocumentNotification.getNotificationDate()), cVar), localDocumentNotification.getStatus().name(), new er.a() { // from class: wr1.e
                    @Override // er.a
                    public final Object a() {
                        return h.x(localDocumentNotification, params);
                    }
                }));
            }
        } else {
            if (i15 != 2) {
                throw new p();
            }
            List<LocalVehicleNotification> listH = aVar3.getData().h();
            arrayList = new ArrayList(pq.v.y(listH, 10));
            Iterator it5 = listH.iterator();
            while (it5.hasNext()) {
                final LocalVehicleNotification localVehicleNotification = (LocalVehicleNotification) it5.next();
                Iterator it6 = it5;
                StringBuilder sb5 = new StringBuilder();
                BaseScaffoldData baseScaffoldData3 = baseScaffoldData2;
                sb5.append(localVehicleNotification.getRegisterNo());
                sb5.append(" - ");
                DropDownDocumentListData dropDownDocumentListData3 = dropDownDocumentListData2;
                sb5.append(r.H1(localVehicleNotification.getConfigId(), 2));
                String string = sb5.toString();
                ez.e eVar2 = this.dateFormatter;
                fz.b.LocalDate localDate2 = new fz.b.LocalDate(localVehicleNotification.getExpirationDate());
                fz.c cVar2 = fz.c.DOTTED;
                arrayList.add(new LocalNotificationItem(string, eVar2.d(localDate2, cVar2), this.dateFormatter.d(new fz.b.LocalDate(localVehicleNotification.getNotificationDate()), cVar2), localVehicleNotification.getStatus().name(), new er.a() { // from class: wr1.f
                    @Override // er.a
                    public final Object a() {
                        return h.z(localVehicleNotification, params);
                    }
                }));
                it5 = it6;
                baseScaffoldData2 = baseScaffoldData3;
                dropDownDocumentListData2 = dropDownDocumentListData3;
                aVarA = aVarA;
            }
            baseScaffoldData = baseScaffoldData2;
            dropDownDocumentListData = dropDownDocumentListData2;
            aVar = aVarA;
        }
        hz.b dataInputError = aVar3.getData().getDataInputError();
        int i16 = b.f214625a[aVar3.getData().getSelectedItemSwitch().ordinal()];
        if (i16 == 1) {
            List listQ = pq.v.q("Dokument", "Ważność", "Notyfikacja", "Status");
            LocalDate documentFormattedDate = aVar3.getData().getDocumentFormattedDate();
            if (documentFormattedDate == null || (strA = this.dateConverter.a(documentFormattedDate)) == null) {
                strA = "";
            }
            localDocumentNotificationConfig = new vr1.d.LocalDocumentNotificationConfig(listQ, strA, params.i());
        } else {
            if (i16 != 2) {
                throw new p();
            }
            List listQ2 = pq.v.q("Pojazd", "Ważność", "Notyfikacja", "Status");
            v50.c.Text text = new v50.c.Text(null, mx.b.b("Nr rejestracyjny", ""), null, mx.b.b(aVar3.getData().getRegisterNo(), ""), null, null, null, new l() { // from class: wr1.g
                @Override // er.l
                public final Object b(Object obj) {
                    return h.E(params, (String) obj);
                }
            }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048437, null);
            LocalDate insuranceDate = aVar3.getData().getInsuranceDate();
            String str = (insuranceDate == null || (strA3 = this.dateConverter.a(insuranceDate)) == null) ? "" : strA3;
            LocalDate technicalExaminationDate = aVar3.getData().getTechnicalExaminationDate();
            localDocumentNotificationConfig = new vr1.d.LocalVehicleNotificationConfig(listQ2, text, str, (technicalExaminationDate == null || (strA2 = this.dateConverter.a(technicalExaminationDate)) == null) ? "" : strA2, params.i());
        }
        return new ur1.d.a.DataSet(baseScaffoldData, aVar, buttonData, buttonData2, modalBottomSheetData, dropDownButtonData, dropDownDocumentListData, lVarF, sheetValue, arrayList, dataInputError, localDocumentNotificationConfig, new n.Switch(new n.Switch.TabItem(mx.b.b("Dokumenty", ""), n.Switch.EnumC5973b.LEFT), new n.Switch.TabItem(mx.b.b("Pojazdy", ""), n.Switch.EnumC5973b.RIGHT), aVar3.getData().getSelectedItemSwitch(), false, params.g(), 8, null), aVar3.getData().getNextCheck(), state instanceof ur1.b.a.Dialog ? ((ur1.b.a.Dialog) state).getDialog() : null);
    }
}
