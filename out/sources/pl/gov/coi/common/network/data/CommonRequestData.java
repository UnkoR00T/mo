package pl.gov.coi.common.network.data;

import androidx.annotation.Keep;
import fr.k;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpl/gov/coi/common/network/data/CommonRequestData;", "T", "", "data", "header", "Lpl/gov/coi/common/network/data/HeaderDomain;", "identity", "Lpl/gov/coi/common/network/data/IdentityContext;", "signed", "", "<init>", "(Ljava/lang/Object;Lpl/gov/coi/common/network/data/HeaderDomain;Lpl/gov/coi/common/network/data/IdentityContext;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getHeader", "()Lpl/gov/coi/common/network/data/HeaderDomain;", "getIdentity", "()Lpl/gov/coi/common/network/data/IdentityContext;", "getSigned", "()Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommonRequestData<T> {

    @c("data")
    private final T data;

    @c("header")
    private final HeaderDomain header;

    @c("identity")
    private final IdentityContext identity;

    @c("signed")
    private final String signed;

    public CommonRequestData() {
        this(null, null, null, null, 15, null);
    }

    public final T getData() {
        return this.data;
    }

    public final HeaderDomain getHeader() {
        return this.header;
    }

    public final IdentityContext getIdentity() {
        return this.identity;
    }

    public final String getSigned() {
        return this.signed;
    }

    public CommonRequestData(T t15, HeaderDomain headerDomain, IdentityContext identityContext, String str) {
        this.data = t15;
        this.header = headerDomain;
        this.identity = identityContext;
        this.signed = str;
    }

    public /* synthetic */ CommonRequestData(Object obj, HeaderDomain headerDomain, IdentityContext identityContext, String str, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : obj, (i15 & 2) != 0 ? null : headerDomain, (i15 & 4) != 0 ? null : identityContext, (i15 & 8) != 0 ? null : str);
    }
}
