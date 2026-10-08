package a34;

import er.p;
import ju.j;
import ju.p0;
import oq.i0;
import oq.u;
import org.conscrypt.ct.LogInfo;
import org.conscrypt.ct.LogStore;
import p071kotlin.Metadata;
import vq.k;
import z24.CTLogInfoDomain;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"La34/e;", "Lorg/conscrypt/ct/LogStore;", "Ly24/a;", "ctGetKnownLogUseCase", "<init>", "(Ly24/a;)V", "Lorg/conscrypt/ct/LogStore$State;", "getState", "()Lorg/conscrypt/ct/LogStore$State;", "", "getMajorVersion", "()I", "getMinorVersion", "getCompatVersion", "getMinCompatVersionAvailable", "", "getTimestamp", "()J", "", "logId", "Lorg/conscrypt/ct/LogInfo;", "getKnownLog", "([B)Lorg/conscrypt/ct/LogInfo;", "a", "Ly24/a;", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements LogStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y24.a ctGetKnownLogUseCase;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lorg/conscrypt/ct/LogInfo;", "<anonymous>", "(Lju/p0;)Lorg/conscrypt/ct/LogInfo;"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, tq.e<? super LogInfo>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2592e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ byte[] f2594g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(byte[] bArr, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f2594g = bArr;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f2592e;
            if (i15 == 0) {
                u.b(obj);
                y24.a aVar = e.this.ctGetKnownLogUseCase;
                y24.a.C5971a c5971a = new y24.a.C5971a(this.f2594g);
                this.f2592e = 1;
                obj = aVar.c(c5971a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            CTLogInfoDomain cTLogInfoDomain = (CTLogInfoDomain) obj;
            if (cTLogInfoDomain != null) {
                return new LogInfo.Builder().setUrl(cTLogInfoDomain.getUrl()).setDescription(cTLogInfoDomain.getDescription()).setPublicKey(cTLogInfoDomain.getPublicKey()).setOperator(cTLogInfoDomain.getOperator()).build();
            }
            return null;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super LogInfo> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return e.this.new a(this.f2594g, eVar);
        }
    }

    public e(y24.a aVar) {
        this.ctGetKnownLogUseCase = aVar;
    }

    @Override // org.conscrypt.ct.LogStore
    public int getCompatVersion() {
        return 0;
    }

    @Override // org.conscrypt.ct.LogStore
    public LogInfo getKnownLog(byte[] logId) {
        return (LogInfo) j.b(null, new a(logId, null), 1, null);
    }

    @Override // org.conscrypt.ct.LogStore
    public int getMajorVersion() {
        return 1;
    }

    @Override // org.conscrypt.ct.LogStore
    public int getMinCompatVersionAvailable() {
        return 0;
    }

    @Override // org.conscrypt.ct.LogStore
    public int getMinorVersion() {
        return 0;
    }

    @Override // org.conscrypt.ct.LogStore
    public LogStore.State getState() {
        return LogStore.State.LOADED;
    }

    @Override // org.conscrypt.ct.LogStore
    public long getTimestamp() {
        return 0L;
    }
}
