package pl.gov.coi.mobywatel.feature.childpassportapplication.data.database;

import a61.ChildPassportApplicationDraftDataEntity;
import er.l;
import fr.k;
import java.util.List;
import oa.f;
import oa.u;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import ta.m;
import tq.e;
import uq.b;
import ya.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0014"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/database/a;", "Lz51/a;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "La61/a;", "draft", "Loq/i0;", "b", "(La61/a;Ltq/e;)Ljava/lang/Object;", "a", "e", "(Ltq/e;)Ljava/lang/Object;", "d", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfChildPassportApplicationDraftDataEntity", "c", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements z51.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f158632d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f<ChildPassportApplicationDraftDataEntity> __insertAdapterOfChildPassportApplicationDraftDataEntity = new C3933a();

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.childpassportapplication.data.database.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mobywatel/feature/childpassportapplication/data/database/a$a", "Loa/f;", "La61/a;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;La61/a;)V", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3933a extends f<ChildPassportApplicationDraftDataEntity> {
        C3933a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `child_passport_application_draft_data` (`id`,`draftData`) VALUES (nullif(?, 0),?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(d statement, ChildPassportApplicationDraftDataEntity entity) {
            statement.f0(1, entity.getId());
            statement.g0(2, entity.getDraftData());
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.childpassportapplication.data.database.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/database/a$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements l<e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158635e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ChildPassportApplicationDraftDataEntity f158637g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ChildPassportApplicationDraftDataEntity childPassportApplicationDraftDataEntity, e<? super c> eVar) {
            super(1, eVar);
            this.f158637g = childPassportApplicationDraftDataEntity;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = b.e();
            int i15 = this.f158635e;
            if (i15 == 0) {
                oq.u.b(obj);
                a aVar = a.this;
                ChildPassportApplicationDraftDataEntity childPassportApplicationDraftDataEntity = this.f158637g;
                this.f158635e = 1;
                if (a.super.a(childPassportApplicationDraftDataEntity, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        public final e<i0> M(e<?> eVar) {
            return a.this.new c(this.f158637g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super i0> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    public a(u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(String str, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChildPassportApplicationDraftDataEntity k(String str, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            return dVarE4.Y3() ? new ChildPassportApplicationDraftDataEntity((int) dVarE4.getLong(m.d(dVarE4, "id")), dVarE4.getBlob(m.d(dVarE4, "draftData"))) : null;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(a aVar, ChildPassportApplicationDraftDataEntity childPassportApplicationDraftDataEntity, ya.b bVar) throws Exception {
        aVar.__insertAdapterOfChildPassportApplicationDraftDataEntity.d(bVar, childPassportApplicationDraftDataEntity);
        return i0.f148189a;
    }

    @Override // z51.a
    public Object a(ChildPassportApplicationDraftDataEntity childPassportApplicationDraftDataEntity, e<? super i0> eVar) {
        Object objD = ta.a.d(this.__db, new c(childPassportApplicationDraftDataEntity, null), eVar);
        return objD == b.e() ? objD : i0.f148189a;
    }

    @Override // z51.a
    public Object b(final ChildPassportApplicationDraftDataEntity childPassportApplicationDraftDataEntity, e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: z51.d
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.childpassportapplication.data.database.a.l(this.f232934a, childPassportApplicationDraftDataEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == b.e() ? objE : i0.f148189a;
    }

    @Override // z51.a
    public Object d(e<? super i0> eVar) {
        final String str = "DELETE FROM child_passport_application_draft_data";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: z51.c
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.childpassportapplication.data.database.a.j(str, (ya.b) obj);
            }
        }, eVar);
        return objE == b.e() ? objE : i0.f148189a;
    }

    @Override // z51.a
    public Object e(e<? super ChildPassportApplicationDraftDataEntity> eVar) {
        final String str = "SELECT * FROM child_passport_application_draft_data LIMIT 1";
        return ta.a.e(this.__db, true, false, new l() { // from class: z51.b
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.childpassportapplication.data.database.a.k(str, (ya.b) obj);
            }
        }, eVar);
    }
}
