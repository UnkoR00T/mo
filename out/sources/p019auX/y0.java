package p019auX;

import com.pl.pwpw.mobile.edoapp.edoLibrary.api.SmartAppService;
import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessErrorMessage;
import er.l;
import fr.q;
import oq.i0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 extends q implements l {
    public y0(SmartAppService smartAppService) {
        super(1, smartAppService, SmartAppService.class, "onTimeout", "onTimeout(Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/ProcessErrorMessage;)V", 0);
    }

    @Override // er.l
    public final Object b(Object obj) {
        SmartAppService.access$onTimeout((SmartAppService) this.f66391b, (ProcessErrorMessage) obj);
        return i0.f148189a;
    }
}
