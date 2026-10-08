package pl.gov.coi.mjunior.technical.containers.data.database;

import fr.k;
import hg0.CertificateEntity;
import java.util.List;
import mr.c;
import mu.g;
import oa.f;
import oa.u;
import oq.i0;
import p071kotlin.Metadata;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.CertificateStatusEntity;
import pq.v;
import ta.l;
import ta.m;
import tq.e;
import ya.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0012\u0010\fJ\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lpl/gov/coi/mjunior/technical/containers/data/database/a;", "Lgg0/a;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Lhg0/a;", "certificate", "Loq/i0;", "k", "(Lhg0/a;Ltq/e;)Ljava/lang/Object;", "d", "(Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "f", "()Lmu/g;", "", "g", "h", "Lpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;", "status", "j", "(Lpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;Ltq/e;)Ljava/lang/Object;", "", "certificateBytes", "privateKeyBytes", "certificateStatus", "", "i", "([B[BLpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;Ltq/e;)Ljava/lang/Object;", "isAccepted", "e", "(ZLtq/e;)Ljava/lang/Object;", "a", "Loa/u;", "Loa/f;", "b", "Loa/f;", "__insertAdapterOfCertificateEntity", "Lhg0/b;", "c", "Lhg0/b;", "__certificateStatusEntityDtoConverter", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gg0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hg0.b __certificateStatusEntityDtoConverter = new hg0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f<CertificateEntity> __insertAdapterOfCertificateEntity = new C3930a();

    /* JADX INFO: renamed from: pl.gov.coi.mjunior.technical.containers.data.database.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mjunior/technical/containers/data/database/a$a", "Loa/f;", "Lhg0/a;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lhg0/a;)V", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3930a extends f<CertificateEntity> {
        C3930a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `identity` (`id`,`certificate`,`privatekey`,`status`,`termsAccepted`) VALUES (nullif(?, 0),?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(d statement, CertificateEntity entity) {
            statement.f0(1, entity.getId());
            statement.g0(2, entity.getCertificateBytes());
            statement.g0(3, entity.getPrivateKeyBytes());
            String strA = a.this.__certificateStatusEntityDtoConverter.a(entity.getCertificateStatus());
            if (strA == null) {
                statement.i0(4);
            } else {
                statement.S0(4, strA);
            }
            statement.f0(5, entity.getTermsAccepted() ? 1L : 0L);
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mjunior.technical.containers.data.database.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl/gov/coi/mjunior/technical/containers/data/database/a$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final List<c<?>> a() {
            return v.n();
        }

        private Companion() {
        }
    }

    public a(u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(String str, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
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
    public static final CertificateEntity s(String str, a aVar, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "certificate");
            int iD3 = m.d(dVarE4, "privatekey");
            int iD4 = m.d(dVarE4, "status");
            int iD5 = m.d(dVarE4, "termsAccepted");
            CertificateEntity certificateEntity = null;
            if (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                byte[] blob = dVarE4.getBlob(iD2);
                byte[] blob2 = dVarE4.getBlob(iD3);
                CertificateStatusEntity certificateStatusEntityB = aVar.__certificateStatusEntityDtoConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                if (certificateStatusEntityB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.CertificateStatusEntity', but it was NULL.");
                }
                certificateEntity = new CertificateEntity(i15, blob, blob2, certificateStatusEntityB, ((int) dVarE4.getLong(iD5)) != 0);
            }
            dVarE4.close();
            return certificateEntity;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(a aVar, CertificateEntity certificateEntity, ya.b bVar) throws Exception {
        aVar.__insertAdapterOfCertificateEntity.d(bVar, certificateEntity);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(String str, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            boolean z15 = false;
            if (dVarE4.Y3() && ((int) dVarE4.getLong(0)) != 0) {
                z15 = true;
            }
            return z15;
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
    public static final CertificateEntity v(String str, a aVar, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "certificate");
            int iD3 = m.d(dVarE4, "privatekey");
            int iD4 = m.d(dVarE4, "status");
            int iD5 = m.d(dVarE4, "termsAccepted");
            CertificateEntity certificateEntity = null;
            if (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                byte[] blob = dVarE4.getBlob(iD2);
                byte[] blob2 = dVarE4.getBlob(iD3);
                CertificateStatusEntity certificateStatusEntityB = aVar.__certificateStatusEntityDtoConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                if (certificateStatusEntityB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.CertificateStatusEntity', but it was NULL.");
                }
                certificateEntity = new CertificateEntity(i15, blob, blob2, certificateStatusEntityB, ((int) dVarE4.getLong(iD5)) != 0);
            }
            dVarE4.close();
            return certificateEntity;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(String str, boolean z15, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.f0(1, z15 ? 1L : 0L);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(String str, a aVar, CertificateStatusEntity certificateStatusEntity, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            String strA = aVar.__certificateStatusEntityDtoConverter.a(certificateStatusEntity);
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
    public static final int y(String str, byte[] bArr, byte[] bArr2, a aVar, CertificateStatusEntity certificateStatusEntity, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.g0(1, bArr);
            dVarE4.g0(2, bArr2);
            String strA = aVar.__certificateStatusEntityDtoConverter.a(certificateStatusEntity);
            if (strA == null) {
                dVarE4.i0(3);
            } else {
                dVarE4.S0(3, strA);
            }
            dVarE4.Y3();
            return l.b(bVar);
        } finally {
            dVarE4.close();
        }
    }

    @Override // gg0.a
    public Object d(e<? super CertificateEntity> eVar) {
        final String str = "SELECT * FROM identity LIMIT 1";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: gg0.c
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.a.s(str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // gg0.a
    public Object e(final boolean z15, e<? super i0> eVar) {
        final String str = "UPDATE identity SET termsAccepted = ?";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: gg0.h
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.a.w(str, z15, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // gg0.a
    public g<CertificateEntity> f() {
        final String str = "SELECT * FROM identity LIMIT 1";
        return qa.k.a(this.__db, false, new String[]{"identity"}, new er.l() { // from class: gg0.g
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.a.v(str, this, (ya.b) obj);
            }
        });
    }

    @Override // gg0.a
    public Object g(e<? super Boolean> eVar) {
        final String str = "SELECT termsAccepted FROM identity LIMIT 1";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: gg0.i
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(pl.gov.coi.mjunior.technical.containers.data.database.a.u(str, (ya.b) obj));
            }
        }, eVar);
    }

    @Override // gg0.a
    public Object h(e<? super i0> eVar) {
        final String str = "DELETE FROM identity";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: gg0.e
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.a.r(str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // gg0.a
    public Object i(final byte[] bArr, final byte[] bArr2, final CertificateStatusEntity certificateStatusEntity, e<? super Integer> eVar) {
        final String str = "UPDATE identity SET certificate = ?, privatekey = ?, status = ?";
        return ta.a.e(this.__db, false, true, new er.l() { // from class: gg0.f
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(pl.gov.coi.mjunior.technical.containers.data.database.a.y(str, bArr, bArr2, this, certificateStatusEntity, (ya.b) obj));
            }
        }, eVar);
    }

    @Override // gg0.a
    public Object j(final CertificateStatusEntity certificateStatusEntity, e<? super i0> eVar) {
        final String str = "UPDATE identity SET status = ?";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: gg0.d
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.a.x(str, this, certificateStatusEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // gg0.a
    public Object k(final CertificateEntity certificateEntity, e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: gg0.b
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.a.t(this.f72753a, certificateEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }
}
