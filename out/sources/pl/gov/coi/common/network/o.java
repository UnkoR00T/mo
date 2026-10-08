package pl.gov.coi.common.network;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpl/gov/coi/common/network/o;", "Lay/j;", "Lcom/google/gson/f;", "gson", "<init>", "(Lcom/google/gson/f;)V", "T", "value", "Lmr/p;", "type", "", "b", "(Ljava/lang/Object;Lmr/p;)Ljava/lang/String;", "json", "a", "(Ljava/lang/String;Lmr/p;)Ljava/lang/Object;", "Lcom/google/gson/f;", "c", "()Lcom/google/gson/f;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements ay.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.google.gson.f gson;

    public o(com.google.gson.f fVar) {
        this.gson = fVar;
    }

    @Override // ay.j
    public <T> T a(String json, mr.p type) {
        return (T) this.gson.j(json, mr.v.f(type));
    }

    @Override // ay.j
    public <T> String b(T value, mr.p type) {
        return this.gson.u(value, mr.v.f(type));
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.google.gson.f getGson() {
        return this.gson;
    }
}
