package pl.gov.coi.mobywatel.feature.developer.view.screens.database.data;

import fr.q0;
import fr.t;
import java.util.ArrayList;
import java.util.List;
import mr.c;
import mu.g;
import n10.EncryptedDataField;
import oa.e;
import oa.f;
import oa.u;
import oq.i0;
import oq.k;
import oq.l;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import ta.m;
import uo1.DeveloperSampleEntity;
import uo1.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010\u0015\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00160\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&¨\u0006)"}, d2 = {"Lpl/gov/coi/mobywatel/feature/developer/view/screens/database/data/a;", "Luo1/b;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Luo1/h;", "_value", "", "j", "(Luo1/h;)Ljava/lang/String;", "Ln10/d;", "l", "()Ln10/d;", "k", "(Ljava/lang/String;)Luo1/h;", "Luo1/a;", "document", "Loq/i0;", "a", "(Luo1/a;Ltq/e;)Ljava/lang/Object;", "type", "", "b", "(Luo1/h;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "c", "()Lmu/g;", "d", "(Ltq/e;)Ljava/lang/Object;", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfDeveloperSampleEntity", "Loq/k;", "Loq/k;", "__encryptedDataFieldTypeConverter", "Loa/e;", "Loa/e;", "__updateAdapterOfDeveloperSampleEntity", "e", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements uo1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f158645f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k<n10.d> __encryptedDataFieldTypeConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f<DeveloperSampleEntity> __insertAdapterOfDeveloperSampleEntity = new C3934a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e<DeveloperSampleEntity> __updateAdapterOfDeveloperSampleEntity = new b();

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.developer.view.screens.database.data.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mobywatel/feature/developer/view/screens/database/data/a$a", "Loa/f;", "Luo1/a;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Luo1/a;)V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3934a extends f<DeveloperSampleEntity> {
        C3934a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR ABORT INTO `DeveloperSampleEntity` (`id`,`InternalId`,`EntityType`,`Content`) VALUES (nullif(?, 0),?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, DeveloperSampleEntity entity) {
            statement.f0(1, entity.getId());
            statement.S0(2, entity.getInternalId());
            statement.S0(3, a.this.j(entity.getEntityType()));
            byte[] bArrB = a.this.l().b(entity.getContent());
            if (bArrB == null) {
                statement.i0(4);
            } else {
                statement.g0(4, bArrB);
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mobywatel/feature/developer/view/screens/database/data/a$b", "Loa/e;", "Luo1/a;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "d", "(Lya/d;Luo1/a;)V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends e<DeveloperSampleEntity> {
        b() {
        }

        @Override // oa.e
        protected String b() {
            return "UPDATE OR ABORT `DeveloperSampleEntity` SET `id` = ?,`InternalId` = ?,`EntityType` = ?,`Content` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, DeveloperSampleEntity entity) {
            statement.f0(1, entity.getId());
            statement.S0(2, entity.getInternalId());
            statement.S0(3, a.this.j(entity.getEntityType()));
            byte[] bArrB = a.this.l().b(entity.getContent());
            if (bArrB == null) {
                statement.i0(4);
            } else {
                statement.g0(4, bArrB);
            }
            statement.f0(5, entity.getId());
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.developer.view.screens.database.data.a$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl/gov/coi/mobywatel/feature/developer/view/screens/database/data/a$c;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final List<c<?>> a() {
            return v.e(q0.c(n10.d.class));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158652a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.TYPE_B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f158652a = iArr;
        }
    }

    public a(final u uVar) {
        this.__encryptedDataFieldTypeConverter = l.a(new er.a() { // from class: uo1.c
            @Override // er.a
            public final Object a() {
                return pl.gov.coi.mobywatel.feature.developer.view.screens.database.data.a.m(uVar);
            }
        });
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j(h _value) {
        int i15 = d.f158652a[_value.ordinal()];
        if (i15 == 1) {
            return "TYPE_A";
        }
        if (i15 == 2) {
            return "TYPE_B";
        }
        throw new p();
    }

    private final h k(String _value) {
        if (t.c(_value, "TYPE_A")) {
            return h.TYPE_A;
        }
        if (t.c(_value, "TYPE_B")) {
            return h.TYPE_B;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n10.d l() {
        return this.__encryptedDataFieldTypeConverter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n10.d m(u uVar) {
        Object objF = uVar.F(q0.c(n10.d.class));
        if (objF != null) {
            return (n10.d) objF;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List q(String str, a aVar, h hVar, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, aVar.j(hVar));
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "InternalId");
            int iD3 = m.d(dVarE4, "EntityType");
            int iD4 = m.d(dVarE4, "Content");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                h hVarK = aVar.k(dVarE4.u3(iD3));
                EncryptedDataField encryptedDataFieldA = aVar.l().a(dVarE4.isNull(iD4) ? null : dVarE4.getBlob(iD4));
                if (encryptedDataFieldA == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.common.storage.database.encryptedfield.EncryptedDataField', but it was NULL.");
                }
                arrayList.add(new DeveloperSampleEntity(i15, strU3, hVarK, encryptedDataFieldA));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(a aVar, DeveloperSampleEntity developerSampleEntity, ya.b bVar) throws Exception {
        aVar.__insertAdapterOfDeveloperSampleEntity.d(bVar, developerSampleEntity);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List s(String str, a aVar, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "InternalId");
            int iD3 = m.d(dVarE4, "EntityType");
            int iD4 = m.d(dVarE4, "Content");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                h hVarK = aVar.k(dVarE4.u3(iD3));
                EncryptedDataField encryptedDataFieldA = aVar.l().a(dVarE4.isNull(iD4) ? null : dVarE4.getBlob(iD4));
                if (encryptedDataFieldA == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.common.storage.database.encryptedfield.EncryptedDataField', but it was NULL.");
                }
                arrayList.add(new DeveloperSampleEntity(i15, strU3, hVarK, encryptedDataFieldA));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    @Override // uo1.b
    public Object a(final DeveloperSampleEntity developerSampleEntity, tq.e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: uo1.g
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.developer.view.screens.database.data.a.r(this.f199542a, developerSampleEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // uo1.b
    public Object b(final h hVar, tq.e<? super List<DeveloperSampleEntity>> eVar) {
        final String str = "SELECT * FROM DeveloperSampleEntity WHERE EntityType = ?";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: uo1.f
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.developer.view.screens.database.data.a.q(str, this, hVar, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // uo1.b
    public g<List<DeveloperSampleEntity>> c() {
        final String str = "SELECT * FROM DeveloperSampleEntity";
        return qa.k.a(this.__db, false, new String[]{"DeveloperSampleEntity"}, new er.l() { // from class: uo1.d
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.developer.view.screens.database.data.a.s(str, this, (ya.b) obj);
            }
        });
    }

    @Override // uo1.b
    public Object d(tq.e<? super i0> eVar) {
        final String str = "DELETE FROM DeveloperSampleEntity";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: uo1.e
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.developer.view.screens.database.data.a.p(str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }
}
