package pl.gov.coi.mobywatel.technical.containers.data.database;

import er.l;
import fr.k;
import java.util.ArrayList;
import java.util.List;
import m24.CertificateEntity;
import mu.g;
import oa.f;
import oa.u;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.CertificateEntityStatus;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.CertificateEntityType;
import pq.v;
import ta.m;
import tq.e;
import ya.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010.¨\u00060"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/database/a;", "Ll24/a;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Lf24/c;", "_value", "", "q", "(Lf24/c;)Ljava/lang/String;", "Lm24/a;", "certificate", "", "e", "(Lm24/a;Ltq/e;)Ljava/lang/Object;", "certificateType", "b", "(Lf24/c;Ltq/e;)Ljava/lang/Object;", "", "a", "(Ltq/e;)Ljava/lang/Object;", "h", "Lmu/g;", "f", "()Lmu/g;", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityType;", "Loq/i0;", "c", "(Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityType;Ltq/e;)Ljava/lang/Object;", "", "newId", "d", "(Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityType;ILtq/e;)Ljava/lang/Object;", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityStatus;", "status", "g", "(Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityStatus;Ltq/e;)Ljava/lang/Object;", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfCertificateEntity", "Lm24/b;", "Lm24/b;", "__certificateEntityStatusConverter", "Lm24/c;", "Lm24/c;", "__certificateEntityTypeConverter", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements l24.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m24.b __certificateEntityStatusConverter = new m24.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m24.c __certificateEntityTypeConverter = new m24.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f<CertificateEntity> __insertAdapterOfCertificateEntity = new C3943a();

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.technical.containers.data.database.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mobywatel/technical/containers/data/database/a$a", "Loa/f;", "Lm24/a;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lm24/a;)V", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3943a extends f<CertificateEntity> {
        C3943a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `parentCertificate` (`id`,`certificate`,`privateKey`,`status`,`type`,`ticket`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(d statement, CertificateEntity entity) {
            statement.f0(1, entity.getId());
            statement.g0(2, entity.getCertificate());
            statement.g0(3, entity.getPrivateKey());
            String strA = a.this.__certificateEntityStatusConverter.a(entity.getCertificateStatus());
            if (strA == null) {
                statement.i0(4);
            } else {
                statement.S0(4, strA);
            }
            String strA2 = a.this.__certificateEntityTypeConverter.a(entity.getCertificateTypeEntity());
            if (strA2 == null) {
                statement.i0(5);
            } else {
                statement.S0(5, strA2);
            }
            statement.S0(6, entity.getTicket());
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.technical.containers.data.database.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/database/a$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final List<mr.c<?>> a() {
            return v.n();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159062a;

        static {
            int[] iArr = new int[f24.c.values().length];
            try {
                iArr[f24.c.CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f24.c.REFUGEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f24.c.UNIVERSITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f159062a = iArr;
        }
    }

    public a(u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(String str, a aVar, CertificateEntityStatus certificateEntityStatus, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            String strA = aVar.__certificateEntityStatusConverter.a(certificateEntityStatus);
            if (strA == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, strA);
            }
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    private final String q(f24.c _value) {
        int i15 = c.f159062a[_value.ordinal()];
        if (i15 == 1) {
            return "CITIZEN";
        }
        if (i15 == 2) {
            return "REFUGEE";
        }
        if (i15 == 3) {
            return "UNIVERSITY";
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(String str, a aVar, CertificateEntityType certificateEntityType, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            String strA = aVar.__certificateEntityTypeConverter.a(certificateEntityType);
            if (strA == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, strA);
            }
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(String str, a aVar, CertificateEntityType certificateEntityType, int i15, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            String strA = aVar.__certificateEntityTypeConverter.a(certificateEntityType);
            if (strA == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, strA);
            }
            dVarE4.f0(2, i15);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final CertificateEntity v(String str, a aVar, f24.c cVar, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, aVar.q(cVar));
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "certificate");
            int iD3 = m.d(dVarE4, "privateKey");
            int iD4 = m.d(dVarE4, "status");
            int iD5 = m.d(dVarE4, "type");
            int iD6 = m.d(dVarE4, "ticket");
            CertificateEntity certificateEntity = null;
            String strU3 = null;
            if (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                byte[] blob = dVarE4.getBlob(iD2);
                byte[] blob2 = dVarE4.getBlob(iD3);
                CertificateEntityStatus certificateEntityStatusB = aVar.__certificateEntityStatusConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                if (certificateEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.CertificateEntityStatus', but it was NULL.");
                }
                if (!dVarE4.isNull(iD5)) {
                    strU3 = dVarE4.u3(iD5);
                }
                CertificateEntityType certificateEntityTypeB = aVar.__certificateEntityTypeConverter.b(strU3);
                if (certificateEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.CertificateEntityType', but it was NULL.");
                }
                certificateEntity = new CertificateEntity(i15, blob, blob2, certificateEntityStatusB, certificateEntityTypeB, dVarE4.u3(iD6));
            }
            dVarE4.close();
            return certificateEntity;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List w(String str, a aVar, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "certificate");
            int iD3 = m.d(dVarE4, "privateKey");
            int iD4 = m.d(dVarE4, "status");
            int iD5 = m.d(dVarE4, "type");
            int iD6 = m.d(dVarE4, "ticket");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                byte[] blob = dVarE4.getBlob(iD2);
                byte[] blob2 = dVarE4.getBlob(iD3);
                String strU3 = null;
                CertificateEntityStatus certificateEntityStatusB = aVar.__certificateEntityStatusConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                if (certificateEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.CertificateEntityStatus', but it was NULL.");
                }
                if (!dVarE4.isNull(iD5)) {
                    strU3 = dVarE4.u3(iD5);
                }
                CertificateEntityType certificateEntityTypeB = aVar.__certificateEntityTypeConverter.b(strU3);
                if (certificateEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.CertificateEntityType', but it was NULL.");
                }
                arrayList.add(new CertificateEntity(i15, blob, blob2, certificateEntityStatusB, certificateEntityTypeB, dVarE4.u3(iD6)));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final CertificateEntity x(String str, a aVar, f24.c cVar, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, aVar.q(cVar));
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "certificate");
            int iD3 = m.d(dVarE4, "privateKey");
            int iD4 = m.d(dVarE4, "status");
            int iD5 = m.d(dVarE4, "type");
            int iD6 = m.d(dVarE4, "ticket");
            CertificateEntity certificateEntity = null;
            String strU3 = null;
            if (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                byte[] blob = dVarE4.getBlob(iD2);
                byte[] blob2 = dVarE4.getBlob(iD3);
                CertificateEntityStatus certificateEntityStatusB = aVar.__certificateEntityStatusConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                if (certificateEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.CertificateEntityStatus', but it was NULL.");
                }
                if (!dVarE4.isNull(iD5)) {
                    strU3 = dVarE4.u3(iD5);
                }
                CertificateEntityType certificateEntityTypeB = aVar.__certificateEntityTypeConverter.b(strU3);
                if (certificateEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.CertificateEntityType', but it was NULL.");
                }
                certificateEntity = new CertificateEntity(i15, blob, blob2, certificateEntityStatusB, certificateEntityTypeB, dVarE4.u3(iD6));
            }
            dVarE4.close();
            return certificateEntity;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long y(a aVar, CertificateEntity certificateEntity, ya.b bVar) {
        return aVar.__insertAdapterOfCertificateEntity.e(bVar, certificateEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final CertificateEntity z(String str, a aVar, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "certificate");
            int iD3 = m.d(dVarE4, "privateKey");
            int iD4 = m.d(dVarE4, "status");
            int iD5 = m.d(dVarE4, "type");
            int iD6 = m.d(dVarE4, "ticket");
            CertificateEntity certificateEntity = null;
            String strU3 = null;
            if (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                byte[] blob = dVarE4.getBlob(iD2);
                byte[] blob2 = dVarE4.getBlob(iD3);
                CertificateEntityStatus certificateEntityStatusB = aVar.__certificateEntityStatusConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                if (certificateEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.CertificateEntityStatus', but it was NULL.");
                }
                if (!dVarE4.isNull(iD5)) {
                    strU3 = dVarE4.u3(iD5);
                }
                CertificateEntityType certificateEntityTypeB = aVar.__certificateEntityTypeConverter.b(strU3);
                if (certificateEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.CertificateEntityType', but it was NULL.");
                }
                certificateEntity = new CertificateEntity(i15, blob, blob2, certificateEntityStatusB, certificateEntityTypeB, dVarE4.u3(iD6));
            }
            dVarE4.close();
            return certificateEntity;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    @Override // l24.a
    public Object a(e<? super List<CertificateEntity>> eVar) {
        final String str = "SELECT * FROM parentCertificate";
        return ta.a.e(this.__db, true, false, new l() { // from class: l24.f
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.a.w(str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // l24.a
    public Object b(final f24.c cVar, e<? super CertificateEntity> eVar) {
        final String str = "SELECT * FROM parentCertificate WHERE type = ? LIMIT 1";
        return ta.a.e(this.__db, true, false, new l() { // from class: l24.b
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.a.x(str, this, cVar, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // l24.a
    public Object c(final CertificateEntityType certificateEntityType, e<? super i0> eVar) {
        final String str = "DELETE FROM parentCertificate WHERE type = ?";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: l24.e
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.a.t(str, this, certificateEntityType, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // l24.a
    public Object d(final CertificateEntityType certificateEntityType, final int i15, e<? super i0> eVar) {
        final String str = "DELETE FROM parentCertificate WHERE type = ? AND id != ?";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: l24.i
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.a.u(str, this, certificateEntityType, i15, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // l24.a
    public Object e(final CertificateEntity certificateEntity, e<? super Long> eVar) {
        return ta.a.e(this.__db, false, true, new l() { // from class: l24.h
            @Override // er.l
            public final Object b(Object obj) {
                return Long.valueOf(pl.gov.coi.mobywatel.technical.containers.data.database.a.y(this.f115468a, certificateEntity, (ya.b) obj));
            }
        }, eVar);
    }

    @Override // l24.a
    public g<CertificateEntity> f() {
        final String str = "SELECT * FROM parentCertificate LIMIT 1";
        return qa.k.a(this.__db, false, new String[]{"parentCertificate"}, new l() { // from class: l24.g
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.a.z(str, this, (ya.b) obj);
            }
        });
    }

    @Override // l24.a
    public Object g(final CertificateEntityStatus certificateEntityStatus, e<? super i0> eVar) {
        final String str = "UPDATE parentCertificate SET status = ?";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: l24.d
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.a.A(str, this, certificateEntityStatus, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // l24.a
    public Object h(final f24.c cVar, e<? super CertificateEntity> eVar) {
        final String str = "SELECT * FROM parentCertificate WHERE type = ? AND status = 'ACTIVE' LIMIT 1";
        return ta.a.e(this.__db, true, false, new l() { // from class: l24.c
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.a.v(str, this, cVar, (ya.b) obj);
            }
        }, eVar);
    }
}
