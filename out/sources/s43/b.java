package s43;

import ay.j;
import fr.q0;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.services.data.model.TokenResponseDto;
import w43.TokenResponse;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Ls43/b;", "Lx43/a;", "Lay/j;", "jsonSerializer", "<init>", "(Lay/j;)V", "", "tokenResponseJson", "Lw43/e;", "a", "(Ljava/lang/String;)Lw43/e;", "Lay/j;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements x43.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    public b(j jVar) {
        this.jsonSerializer = jVar;
    }

    @Override // x43.a
    public TokenResponse a(String tokenResponseJson) {
        return t43.a.a((TokenResponseDto) this.jsonSerializer.a(tokenResponseJson, q0.n(TokenResponseDto.class)));
    }
}
