package j13;

import ay.j;
import fr.q0;
import java.util.List;
import mu.g;
import mu.h;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.safetyguide.data.model.EmergencyBackpackAddedItemsDTO;
import pq.v;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u001a"}, d2 = {"Lj13/a;", "Lm13/a;", "Lcz/a;", "storage", "Lay/j;", "jsonSerializer", "<init>", "(Lcz/a;Lay/j;)V", "", "", "addedItems", "Loq/i0;", "d", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "Ll13/a;", "c", "()Ljava/util/List;", "Lcz/a;", "b", "Lay/j;", "Lmu/g;", "Lmu/g;", "()Lmu/g;", "emergencyBackpackAddedItems", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements m13.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f98531e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cz.a storage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g<List<String>> emergencyBackpackAddedItems;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f98535d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f98537f;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f98535d = obj;
            this.f98537f |= PKIFailureInfo.systemUnavail;
            return a.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements g<List<? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f98538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f98539b;

        /* JADX INFO: renamed from: j13.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2315a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f98540a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f98541b;

            /* JADX INFO: renamed from: j13.a$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2316a extends d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f98542d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f98543e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f98544f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f98546h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f98547j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f98548k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f98549l;

                public C2316a(e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f98542d = obj;
                    this.f98543e |= PKIFailureInfo.systemUnavail;
                    return C2315a.this.F(null, this);
                }
            }

            public C2315a(h hVar, a aVar) {
                this.f98540a = hVar;
                this.f98541b = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, e eVar) throws Throwable {
                C2316a c2316a;
                if (eVar instanceof C2316a) {
                    c2316a = (C2316a) eVar;
                    int i15 = c2316a.f98543e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2316a.f98543e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2316a = new C2316a(eVar);
                    }
                } else {
                    c2316a = new C2316a(eVar);
                }
                Object obj2 = c2316a.f98542d;
                Object objE = uq.b.e();
                int i16 = c2316a.f98543e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f98540a;
                    String str = (String) obj;
                    List<String> addedItemsIds = str.length() > 0 ? ((EmergencyBackpackAddedItemsDTO) this.f98541b.jsonSerializer.a(str, q0.n(EmergencyBackpackAddedItemsDTO.class))).getAddedItemsIds() : v.n();
                    c2316a.f98544f = vq.j.a(obj);
                    c2316a.f98546h = vq.j.a(c2316a);
                    c2316a.f98547j = vq.j.a(obj);
                    c2316a.f98548k = vq.j.a(hVar);
                    c2316a.f98549l = 0;
                    c2316a.f98543e = 1;
                    if (hVar.F(addedItemsIds, c2316a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public c(g gVar, a aVar) {
            this.f98538a = gVar;
            this.f98539b = aVar;
        }

        @Override // mu.g
        public Object a(h<? super List<? extends String>> hVar, e eVar) {
            Object objA = this.f98538a.a(new C2315a(hVar, this.f98539b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public a(cz.a aVar, j jVar) {
        this.storage = aVar;
        this.jsonSerializer = jVar;
        aVar.c("EMERGENCY_BACKPACK_DATA_STORE_FILE_NAME");
        this.emergencyBackpackAddedItems = new c(aVar.e(cz.a.C0833a.a("EMERGENCY_BACKPACK_ADDED_ITEM_KEY"), ""), this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6.a(r0) == r1) goto L21;
     */
    @Override // m13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(tq.e<? super oq.i0> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof j13.a.b
            if (r0 == 0) goto L13
            r0 = r6
            j13.a$b r0 = (j13.a.b) r0
            int r1 = r0.f98537f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98537f = r1
            goto L18
        L13:
            j13.a$b r0 = new j13.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f98535d
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f98537f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oq.u.b(r6)
            goto L53
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            oq.u.b(r6)
            goto L48
        L38:
            oq.u.b(r6)
            java.util.List r6 = pq.v.n()
            r0.f98537f = r4
            java.lang.Object r6 = r5.d(r6, r0)
            if (r6 != r1) goto L48
            goto L52
        L48:
            cz.a r6 = r5.storage
            r0.f98537f = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j13.a.a(tq.e):java.lang.Object");
    }

    @Override // m13.a
    public g<List<String>> b() {
        return this.emergencyBackpackAddedItems;
    }

    @Override // m13.a
    public List<l13.a> c() {
        return v.q(new l13.a.Group("water", v.q(new l13.a.Item("bottle_water"), new l13.a.Item("water_filters"), new l13.a.Item("water_purification_tablets"), new l13.a.Item("ready_to_eat_food"))), new l13.a.Group("documents_and_data", v.q(new l13.a.Item("cash"), new l13.a.Item("id_card"), new l13.a.Item("driving_license"), new l13.a.Item("birth_certificate"), new l13.a.Item("insurance_policy"), new l13.a.Item("health_information"), new l13.a.Item("contact_details"), new l13.a.Item("ownership_documents"), new l13.a.Item("pendrive_usb"), new l13.a.Item("important_personal_item"))), new l13.a.Group("first_aid_kit", v.q(new l13.a.Group("first_aid", v.q(new l13.a.Item("gauze"), new l13.a.Item("bandages"), new l13.a.Item("burn_bandages"), new l13.a.Item("bleeding_bandages"), new l13.a.Item("thermometer"), new l13.a.Item("scissors"), new l13.a.Item("anti_dust_mask"), new l13.a.Item("disposable_gloves"), new l13.a.Item("disinfectants"))), new l13.a.Group("medicines", v.q(new l13.a.Item("personal_medications"), new l13.a.Item("painkillers"), new l13.a.Item("anti_inflammatory"), new l13.a.Item("antiemetic"), new l13.a.Item("antidiarrheal"))), new l13.a.Group("personal_hygiene", v.q(new l13.a.Item("toilet_paper"), new l13.a.Item("wet_wipes"), new l13.a.Item("toothbrush"), new l13.a.Item("personal_hygiene_products"))))), new l13.a.Group("lighting_and_connectivity", v.q(new l13.a.Item("flashlight"), new l13.a.Item("radio"), new l13.a.Item("charged_phone"), new l13.a.Item("charger"), new l13.a.Item("charged_power_bank"), new l13.a.Item("devices_cables"), new l13.a.Item("spare_batteries"), new l13.a.Item("alternative_connectivity"))), new l13.a.Group("tools_and_clothes", v.q(new l13.a.Item("pocket_knife"), new l13.a.Item("lighter"), new l13.a.Item("printed_maps"), new l13.a.Item("garbage_bags"), new l13.a.Item("season_clothing"), new l13.a.Item("rainwear"), new l13.a.Item("sleeping_bag"), new l13.a.Item("sleeping_mat"), new l13.a.Item("thermal_foil"))));
    }

    @Override // m13.a
    public Object d(List<String> list, e<? super i0> eVar) {
        Object objD = this.storage.d(cz.a.C0833a.a("EMERGENCY_BACKPACK_ADDED_ITEM_KEY"), this.jsonSerializer.b(new EmergencyBackpackAddedItemsDTO(list), q0.n(EmergencyBackpackAddedItemsDTO.class)), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }
}
