package fo;

import java.sql.Timestamp;
import java.util.Date;
import yn.a0;
import yn.f;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
class c extends z<Timestamp> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final a0 f65537b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z<Date> f65538a;

    class a implements a0 {
        a() {
        }

        @Override // yn.a0
        public <T> z<T> b(f fVar, go.a<T> aVar) {
            a aVar2 = null;
            if (aVar.d() == Timestamp.class) {
                return new c(fVar.l(Date.class), aVar2);
            }
            return null;
        }
    }

    /* synthetic */ c(z zVar, a aVar) {
        this(zVar);
    }

    @Override // yn.z
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp b(ho.a aVar) {
        Date dateB = this.f65538a.b(aVar);
        if (dateB != null) {
            return new Timestamp(dateB.getTime());
        }
        return null;
    }

    @Override // yn.z
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(ho.c cVar, Timestamp timestamp) {
        this.f65538a.d(cVar, timestamp);
    }

    private c(z<Date> zVar) {
        this.f65538a = zVar;
    }
}
