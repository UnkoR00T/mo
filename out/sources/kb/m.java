package kb;

import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f109727a;

    public m(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f109727a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // kb.l
    public String[] a() {
        return this.f109727a.getSupportedFeatures();
    }

    @Override // kb.l
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) xv.a.a(StaticsBoundaryInterface.class, this.f109727a.getStatics());
    }

    @Override // kb.l
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) xv.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f109727a.getWebkitToCompatConverter());
    }
}
