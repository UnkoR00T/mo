package pl.gov.coi.common.network;

import p071kotlin.Metadata;
import pl.gov.coi.common.network.data.CommonRequestData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001Js\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00012\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lpl/gov/coi/common/network/p0;", "", "T", "U", "data", "", "ticket", "documentId", "Lpl/gov/coi/common/network/v0;", "Lpl/gov/coi/common/network/data/CommonRequestData;", "signingType", "Lmr/c;", "returnType", "Ldx/i;", "Ldx/b;", "a", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/common/network/v0;Lmr/c;)Ldx/i;", "b", "()Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface p0 {
    static /* synthetic */ dx.i c(p0 p0Var, Object obj, String str, String str2, v0 v0Var, mr.c cVar, int i15, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generate");
        }
        if ((i15 & 2) != 0) {
            str = null;
        }
        if ((i15 & 4) != 0) {
            str2 = null;
        }
        return p0Var.a(obj, str, str2, v0Var, cVar);
    }

    <T, U> dx.i<dx.b, U> a(T data, String ticket, String documentId, v0<? super T, CommonRequestData<T>> signingType, mr.c<U> returnType);

    String b();
}
