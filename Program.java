package tableBookingMVP;

import tableBookingMVP.models.TableModel;
import tableBookingMVP.presenters.BookingPresenter;
import tableBookingMVP.presenters.Model;
import tableBookingMVP.presenters.View;
import tableBookingMVP.views.BookingView;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model,view);
        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 3, "Anna");
        view.changeReservationTable(1001, new Date(), 2, "Anna");
    }
}
